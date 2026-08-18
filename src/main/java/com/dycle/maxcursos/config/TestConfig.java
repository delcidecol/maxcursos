package com.dycle.maxcursos.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dycle.maxcursos.entities.User;
import com.dycle.maxcursos.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	private final UserRepository userRepository;

	TestConfig(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Marina de Col", "marinadecol@gmail.com", "99122-1281", "123456");
		User u2 = new User(null, "Kleverson Ricardo", "ricador@gmail.com", "99124-6978", "321654");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}

