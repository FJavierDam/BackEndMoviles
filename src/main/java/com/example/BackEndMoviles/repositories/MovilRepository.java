package com.example.BackEndMoviles.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BackEndMoviles.modelo.Movil;

@Repository
public interface MovilRepository extends CrudRepository<Movil, Integer>{

}
