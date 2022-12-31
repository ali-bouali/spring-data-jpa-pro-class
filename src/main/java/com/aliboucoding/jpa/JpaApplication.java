package com.aliboucoding.jpa;

import com.aliboucoding.jpa.models.Author;
import com.aliboucoding.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	) {
		return args -> {
			var author = Author.builder()
					.firstName("alibou")
					.lastName("alibou")
					.age(34)
					.email("contact@aliboucoding.com")
					.build();
			repository.save(author);
		};
	}

}
