package com.class606.demo;

import com.class606.demo.Models.ClassRoom;
import com.class606.demo.Repositories.ClassRoomRepository;
import com.class606.demo.Services.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {
	@Autowired
	ClassRoomRepository classRoomRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

		@Bean
		CommandLineRunner runner(ClassRoomService classRoomService, ClassRoomRepository classRoomRepository){
			return args -> {

		classRoomRepository.saveAll(Arrays.asList(

				new ClassRoom("Tech","TechClass about general Tech"),
				new ClassRoom("BackEnd introduce level","Backend for beginners"),
				new ClassRoom("BackEnd medium level","Backend for beginners"),
				new ClassRoom("BackEnd advance level","Backend for beginners"),
				new ClassRoom("FrontEnd introduce level","Backend for beginners"),
				new ClassRoom("FrontEnd medium level","Backend for beginners"),
				new ClassRoom("FrontEnd advance level","Backend for beginners"),
				new ClassRoom("FullStack medium level","Backend for beginners"),
				new ClassRoom("FullStack advance level","Backend for beginners"),
				new ClassRoom("Engineer","Advance class for engineers")

		));

		};
	}
}

