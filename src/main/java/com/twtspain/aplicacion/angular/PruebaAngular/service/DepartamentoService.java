package com.twtspain.aplicacion.angular.PruebaAngular.service;

import java.util.List;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Departamento;

public interface DepartamentoService {
	
	public List<Departamento> findAll();

	public Departamento findById(Long id);

	public Departamento save(Departamento departamento);

}
