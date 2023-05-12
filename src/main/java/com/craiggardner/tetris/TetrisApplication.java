package com.craiggardner.tetris;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class TetrisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TetrisApplication.class, args);
	}

	public void run(String... args) {
		log.info("Running Application");
	}
}
