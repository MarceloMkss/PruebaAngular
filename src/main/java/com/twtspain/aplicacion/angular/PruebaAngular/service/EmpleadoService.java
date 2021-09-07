package com.twtspain.aplicacion.angular.PruebaAngular.service;

import java.util.List;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Empleado;

public interface EmpleadoService {

	public List<Empleado> findAll();

	public Empleado findById(Long id);

	public Empleado save(Empleado empleado);
	
	

}
