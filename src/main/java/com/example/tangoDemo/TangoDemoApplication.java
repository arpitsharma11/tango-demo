package com.example.tangoDemo;

import com.example.tangoDemo.service.TangoCardService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TangoDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(TangoDemoApplication.class, args);
	}

}
