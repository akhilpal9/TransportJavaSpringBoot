package com.transport;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Transport implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Transport.class, args);
	}

	@Override
	public void run(java.lang.String... args) throws Exception {
		System.out.println("In run");
	}
}
