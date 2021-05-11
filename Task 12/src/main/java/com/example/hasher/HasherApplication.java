package com.example.hasher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HasherApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HasherApplication.class, args);
	}

	// доступ к аргументам командной строки
	@Override
	public void run(String... args) throws Exception {
		// наша логика
	}

}
