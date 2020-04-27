package com.joserod.space.websitebackend.controllers;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
// import org.json.simple.JSONArray; 
// import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.joserod.space.websitebackend.pojos.Project;

@RestController
@Configuration
public class WebsiteApi {

	@Value("${GITHUB_TOKEN}")
	private String githubToken;
	
	private ArrayList<Project> projects;

	private String json;
	
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		System.out.println("hello world, I have just started up");
		refreshProjects();
	}

	@GetMapping(value="/hello")
	public String hello() {
		String url = "https://api.github.com/users/p0dxD/repos?sort=updated";
		String result = makeAPIcall(url);
		printJsonAndSaveObject(result, false);
		return json;
	}

	@GetMapping(value="/refreshProjects")
	public String refreshProjects() {
		String url = "https://api.github.com/users/p0dxD/repos?sort=updated";
		String result = makeAPIcall(url);
		printJsonAndSaveObject(result, true);
		return "refreshed";
	}

	public void printJsonAndSaveObject(String jsonObj, boolean refresh) {
		if (projects == null || refresh ) {
			projects = new ArrayList<>();
		} else {
			//we have something on it already will return
			return;
		}
		String url = "https://api.github.com/repos/";
		JSONArray ja = new JSONArray(jsonObj);

		for (int i = 0; i < ja.length(); i++) {
			// for (int i = 0; i < 1; i++) {
			JSONObject tmp = ja.getJSONObject(i);
			String name = tmp.getString("full_name");
			String html_url = tmp.getString("html_url");
			String dateCreated = tmp.getString("created_at");
			String dateLastUpdated = tmp.getString("updated_at");
			ArrayList<String> languages = makeLanguageList("["+makeAPIcall(url+tmp.getString("full_name")+"/languages")+"]");
			name = name.contains("p0dxD/") ? name.substring("p0dxD/".length()) : name;
			Project project = new Project( name,  html_url,  dateCreated,  dateLastUpdated, languages);
			projects.add(project);
		  }
		  //construct it, first time we have it
		  Gson gson = new Gson();
		  json = gson.toJson(projects);
	}

	private ArrayList<String> makeLanguageList(String languages) {
		ArrayList<String> languageArray = new ArrayList<>();
		if (languages.equals("[{}]")) {
			return languageArray;
		}
		JSONArray ja = new JSONArray(languages);
		for (int i = 0; i < ja.length(); i++) {
			JSONObject tmp = ja.getJSONObject(i);
			String[] elementNames = JSONObject.getNames(tmp);
			for (String element: elementNames) {
				String elementValue = String.valueOf(tmp.get(element));
				// System.out.println("key: " + element + " value: " + elementValue);
				languageArray.add(element);
			}
		}
		return languageArray;
	}

	private String makeAPIcall(String url) {
		RestTemplate restTemplate = new RestTemplate();
	
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/vnd.github.mercy-preview+json");  
		headers.set("Authorization", "token " + githubToken);

		// build the request
		HttpEntity request = new HttpEntity(headers);
	
		// use `exchange` method for HTTP call
		ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, request, String.class);	
		if(result.getStatusCode() == HttpStatus.OK) {
			return result.getBody();
		} else {
			return null;
		}
	}
}