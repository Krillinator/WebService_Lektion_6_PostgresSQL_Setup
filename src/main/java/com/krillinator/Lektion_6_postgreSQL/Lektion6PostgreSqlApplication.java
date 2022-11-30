package com.krillinator.Lektion_6_postgreSQL;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lektion6PostgreSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lektion6PostgreSqlApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

		Student student = context.getBean("studentBean", Student.class);

		System.out.println(student.getName());

	}

}
