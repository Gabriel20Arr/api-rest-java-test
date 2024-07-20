package com.apirest.crud.proyectojava02;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proyectojava02Application {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		// Set system properties from dotenv
		System.setProperty("SPRING_DATASOURCE_URL", dotenv.get("SPRING_DATASOURCE_URL"));
		System.setProperty("SPRING_DATASOURCE_USERNAME", dotenv.get("SPRING_DATASOURCE_USERNAME"));
		System.setProperty("SPRING_DATASOURCE_PASSWORD", dotenv.get("SPRING_DATASOURCE_PASSWORD"));
		System.setProperty("SPRING_DATASOURCE_DB", dotenv.get("SPRING_DATASOURCE_DB"));

		SpringApplication.run(Proyectojava02Application.class, args);

		// Verifica que las variables de entorno se están cargando correctamente
		// System.out.println("SPRING_DATASOURCE_USERNAME: " +
		// System.getProperty("SPRING_DATASOURCE_USERNAME"));
		// System.out.println("SPRING_DATASOURCE_PASSWORD: " +
		// System.getProperty("SPRING_DATASOURCE_PASSWORD"));

	}

}
