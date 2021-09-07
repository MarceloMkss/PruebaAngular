package com.twtspain.aplicacion.angular.PruebaAngular.service;

import java.util.List;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Trabajo;

public interface TrabajoService {
	
	public List<Trabajo> findAll();

	public Trabajo findById(String id);

	public Trabajo save(Trabajo trabajo);

}
