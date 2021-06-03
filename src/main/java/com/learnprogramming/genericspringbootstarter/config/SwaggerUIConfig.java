package com.learnprogramming.genericspringbootstarter.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class SwaggerUIConfig implements WebMvcConfigurer{
	
	 @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addRedirectViewController("/", "swagger-ui.html");
	    }

}
