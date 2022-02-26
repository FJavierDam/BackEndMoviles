package com.example.BackEndMoviles;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.BackEndMoviles.control.ObjectMother;
import com.example.BackEndMoviles.domain.AppUser;
import com.example.BackEndMoviles.modelo.Movil;
import com.example.BackEndMoviles.repositories.AppUserRepository;
import com.example.BackEndMoviles.repositories.MovilRepository;
import com.example.BackEndMoviles.security.ApplicationUserRol;
import com.example.BackEndMoviles.services.AppUserService;
import com.example.BackEndMoviles.services.MovilService;

@SpringBootTest
class BackEndMovilesTests {

//	@Autowired
//	MovilRepository movilRepository;
	@Autowired
	AppUserRepository appRepository;
	
	@Autowired
	AppUserService appUserService;

	@Test
	void contextLoads() {

//		ObjectMother objectMother = new ObjectMother();
//		Set<Movil> listaMoviles = new HashSet<>();
//
//		for (int i = 0; i < 50; i++) {
//			listaMoviles.add(objectMother.generarMovil(i));
//		}
//
////		listaMoviles.forEach((a) -> {
////			System.out.println(a.toString());
////		});
//		movilRepository.saveAll(listaMoviles);
//		
		Set<AppUser> users = new HashSet<>();
		AppUser user1 = new AppUser("vir","123");
		AppUser user2 = new AppUser("francis","321");
		users.add(user1);
		users.add(user2);
	    appUserService.addRoleToUser("vir",ApplicationUserRol.ADMIN.name());
	    appUserService.addRoleToUser("francis", ApplicationUserRol.ADMIN.name());
	    
	    users.forEach((a) -> {
	    	appRepository.save(a);
		});
	    
		
	}

}
