package com.example.BackEndMoviles.control;

import javax.persistence.Entity;

import com.example.BackEndMoviles.modelo.Movil;



public class ObjectMother {
	
	
	
	
	public Movil generarMovil(int id){
		
		return Movil.builderMovil()
				.Id(id)
				.Marca()
				.Modelo()
				.Pantalla()
				.Ram()
				.Procesador()
				.Antutu()
				.Bateria()
				.Precio()
				.movilBuild();
	}
	
}
