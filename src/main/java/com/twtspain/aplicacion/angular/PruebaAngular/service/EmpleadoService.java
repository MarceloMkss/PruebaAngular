package com.twtspain.aplicacion.angular.PruebaAngular.service;

import java.util.List;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Departamento;
import com.twtspain.aplicacion.angular.PruebaAngular.entity.Empleado;
import com.twtspain.aplicacion.angular.PruebaAngular.entity.Trabajo;

public interface EmpleadoService {

	public List<Empleado> findAll();

	public Empleado findById(Long id);

	public Empleado save(Empleado empleado);
	
	public List<Departamento> findAllDepartamentos();
	
	public List<Trabajo> findAllTrabajos();

}
