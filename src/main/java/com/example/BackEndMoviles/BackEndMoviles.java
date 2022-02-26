package com.example.BackEndMoviles;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.example.BackEndMoviles.control.ObjectMother;
import com.example.BackEndMoviles.domain.AppUser;
import com.example.BackEndMoviles.modelo.Movil;
import com.example.BackEndMoviles.repositories.AppUserRepository;
import com.example.BackEndMoviles.repositories.MovilRepository;
import com.example.BackEndMoviles.services.AppUserService;
import com.example.BackEndMoviles.services.MovilService;

@SpringBootApplication
public class BackEndMoviles {
	
	@Autowired
	MovilRepository movilRepository;
	@Autowired
	AppUserRepository appUserRepository;
	@Autowired
	AppUserService appUserService;
	@Autowired
	MovilService movilService;

	public static void main(String[] args) {
		SpringApplication.run(BackEndMoviles.class, args);
		
	}
	
	@Bean
	public void moviles() {
		Iterable<Movil> findAll = movilRepository.findAll();
		movilService.rellenarMoviles(findAll);
	}
	
//	@Bean
//	public void users() {
//		Iterable<AppUser> findAll = appUserRepository.findAll();
//		appUserService.rellenarUsuarios(findAll);
//	}

}
