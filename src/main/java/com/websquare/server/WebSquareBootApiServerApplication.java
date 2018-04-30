package com.websquare.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WebSquareBootApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSquareBootApiServerApplication.class, args);
	}
}
