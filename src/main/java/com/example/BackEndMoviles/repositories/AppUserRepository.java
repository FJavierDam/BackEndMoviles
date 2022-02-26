package com.example.BackEndMoviles.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BackEndMoviles.domain.AppUser;
import com.example.BackEndMoviles.modelo.Movil;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
	
	

}
