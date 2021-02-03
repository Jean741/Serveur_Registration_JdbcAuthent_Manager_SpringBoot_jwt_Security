package com.example.jwtSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jwtSpring.User.repository.RoleRepository;
import com.example.jwtSpring.entities.Role;
import com.example.jwtSpring.enumerations.ERole;

@SpringBootApplication
public class ExempleJwtProjectSpringApplication implements CommandLineRunner{
	
	@Autowired
	RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExempleJwtProjectSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		roleRepository.save(new Role(ERole.ROLE_USER));
		roleRepository.save(new Role(ERole.ROLE_MODERATOR));
		roleRepository.save(new Role(ERole.ROLE_ADMIN));

	}

}
