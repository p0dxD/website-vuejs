package com.joserod.space.websitebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan(basePackages={"com.joserod.space.websitebackend.controllers","com.joserod.space.websitebackend.configs"})
public class WebsiteBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteBackendApplication.class, args);
	}

}
