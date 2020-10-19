package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

  public class SpringBootMvcProjectApplication {
  
  public static void main(String[] args) {
  SpringApplication.run(SpringBootMvcProjectApplication.class, args);
  System.out.println("Hello"); }
  
  }
 

	/*
	 * public class SpringBootMvcProjectApplication extends
	 * SpringBootServletInitializer{
	 * 
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { return
	 * application.sources(SpringBootMvcProjectApplication.class); } }
	 */