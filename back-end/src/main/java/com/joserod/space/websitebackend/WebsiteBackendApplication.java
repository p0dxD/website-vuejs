package com.joserod.space.websitebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.joserod.space.websitebackend.controllers","com.joserod.space.websitebackend.configs"})
public class WebsiteBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteBackendApplication.class, args);
	}

}
