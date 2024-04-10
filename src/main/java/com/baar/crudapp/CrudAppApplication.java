package com.baar.crudapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@SpringBootApplication
@RestController
public class CrudAppApplication {
	@GetMapping("/")
	public String home() {
		log.info("Hello World!");
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}

}
