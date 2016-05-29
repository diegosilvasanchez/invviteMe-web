package br.com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class InvvitemeSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvvitemeSiteApplication.class, args);
	}
}
