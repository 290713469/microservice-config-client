package com.yrk.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	@Value("${clientParam}")
	private String clientParam;
	
	@RequestMapping("/clientParam")
	public String getParam() {
		return this.clientParam;
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
