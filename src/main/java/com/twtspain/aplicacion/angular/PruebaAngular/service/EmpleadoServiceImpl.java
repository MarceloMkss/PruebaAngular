package com.twtspain.aplicacion.angular.PruebaAngular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Empleado;
import com.twtspain.aplicacion.angular.PruebaAngular.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	
	
	@Override
	public List<Empleado> findAll() {
		
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado findById(Long id) {
		
		return empleadoRepository.getById(id);
	}

	@Override
	public Empleado save(Empleado empleado) {
		
		return null;
	}

}
