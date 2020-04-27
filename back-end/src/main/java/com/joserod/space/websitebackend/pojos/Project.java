package com.joserod.space.websitebackend.pojos;

import java.util.ArrayList;

public class Project {
    private String name;
    private String htmlUrl;
    private String dateCreated;
    private String dateLastUpdated;
    private ArrayList<String> languages;

    public Project(String name, String htmlUrl, String dateCreated, String dateLastUpdated, ArrayList<String> languages) {
        this.name = name;
        this.htmlUrl = htmlUrl;
        this.dateCreated = dateCreated;
        this.dateLastUpdated = dateLastUpdated;
        this.languages = languages;
    }
    
    public String getName() {
        return this.name;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public String dateCreated() {
        return this.dateCreated;
    }

    public String dateLastUpdated() {
        return this.dateLastUpdated;
    }

    public ArrayList<String> getLanguages() {
        return this.languages;
    }

    @Override
    public String toString() {
        return "name: " + this.name  + "\n" + "htlm_url:" + this.htmlUrl 
                + "\n" + "date created:" + this.dateCreated +"\n" + "date last updated: " 
                + this.dateLastUpdated +"\n" + "languages: " + languages;
    }
}