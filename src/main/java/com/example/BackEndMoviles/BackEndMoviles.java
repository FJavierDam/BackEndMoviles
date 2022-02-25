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
import com.example.BackEndMoviles.modelo.Movil;
import com.example.BackEndMoviles.modelo.MovilRepository;

@SpringBootApplication
public class BackEndMoviles {
	
	

	public static void main(String[] args) {
		SpringApplication.run(BackEndMoviles.class, args);
		
	}

}
