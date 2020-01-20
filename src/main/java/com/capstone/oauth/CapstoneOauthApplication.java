package com.capstone.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
public class CapstoneOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneOauthApplication.class, args);
	}

}
