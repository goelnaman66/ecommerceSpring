package com.example.EcommerceProjectSpring;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EcommerceProjectSpringApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().load(); // load .env file from the root path

		dotenv.entries().forEach( (DotenvEntry entry) -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(EcommerceProjectSpringApplication.class, args);
	}

}
