package ru.aston.course;

import org.springframework.boot.SpringApplication;

public class TestSpringAndKafkaForAstonApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringAndKafkaForAstonApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
