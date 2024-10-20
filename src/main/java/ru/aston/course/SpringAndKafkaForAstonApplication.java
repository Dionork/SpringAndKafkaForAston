package ru.aston.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.aston.course.generate.FileGenerator;

@SpringBootApplication
public class SpringAndKafkaForAstonApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringAndKafkaForAstonApplication.class, args);
        FileGenerator.fileGenerate();
    }
}
