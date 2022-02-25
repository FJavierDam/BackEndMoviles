package com.example.BackEndMoviles;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.BackEndMoviles.control.ObjectMother;
import com.example.BackEndMoviles.modelo.Movil;
import com.example.BackEndMoviles.modelo.MovilRepository;
import com.example.BackEndMoviles.services.MovilService;

@SpringBootTest
class BackEndMovilesTests {

	@Autowired
	MovilRepository movilRepository;

	@Test
	void contextLoads() {

//		ObjectMother objectMother = new ObjectMother();
//		Set<Movil> listaMoviles = new HashSet<>();
//
//		for (int i = 0; i < 50; i++) {
//			listaMoviles.add(objectMother.generarMovil(i));
//		}
//
//		listaMoviles.forEach((a) -> {
//			System.out.println(a.toString());
//		});
//		movilRepository.saveAll(listaMoviles);
	}

}
