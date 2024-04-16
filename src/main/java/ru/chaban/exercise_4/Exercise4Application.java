package ru.chaban.exercise_4;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.chaban.exercise_4.domain.Users;
import ru.chaban.exercise_4.repository.UsersRepository;

@SpringBootApplication
@AllArgsConstructor
public class Exercise4Application {

	private UsersRepository usersRepository;

	public static void main(String[] args) {
		SpringApplication.run(Exercise4Application.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("Start!!!!!!!!!!!!!!!!!!");
		Users users = new Users();
		usersRepository.save(users);

		System.out.println("--------");
	}

}
