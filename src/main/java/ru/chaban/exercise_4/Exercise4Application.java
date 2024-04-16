package ru.chaban.exercise_4;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.chaban.exercise_4.domain.GroupStart;
import ru.chaban.exercise_4.repository.GroupStartRepository;

@SpringBootApplication
@AllArgsConstructor
public class Exercise4Application {

	private GroupStartRepository groupStartRepository;

	public static void main(String[] args) {
		SpringApplication.run(Exercise4Application.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("Start!!!!!!!!!!!!!!!!!!");
		GroupStart groupStart = new GroupStart();
		groupStartRepository.save(groupStart);

		System.out.println("--------");
	}

}
