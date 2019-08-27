package com.example.oauth2.demooauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class DemoOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoOauth2Application.class, args);
	}

	@GetMapping("/")
	public String getMessage(Principal principal){
		return "The user name : "+principal.getName();
	}

}
