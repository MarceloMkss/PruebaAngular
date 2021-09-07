package com.twtspain.aplicacion.angular.PruebaAngular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.twtspain.aplicacion.angular.PruebaAngular.repository.EmpleadoRepository;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
@ComponentScan
public class PruebaAngularApplication implements CommandLineRunner {

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaAngularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
//		Empleado e = new Empleado();
//		e.setApellido("de mraz");
//		Set<Empleado> lista = new HashSet<>();
//		lista.add(e);
//		
//		empleadoRepository.save(e);
		
	
		
	
		
		
	}

}
