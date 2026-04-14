package com.vivek.todolist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class todolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(todolistApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo() {
        return args -> {
            System.out.println("---------------------------------");
            System.out.println("Spring Boot is running successfully!");
            System.out.println("Ready to build the Todo List!");
            System.out.println("---------------------------------");
        };
    }
}
