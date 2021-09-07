package com.twtspain.aplicacion.angular.PruebaAngular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Departamento;
import com.twtspain.aplicacion.angular.PruebaAngular.entity.Empleado;
import com.twtspain.aplicacion.angular.PruebaAngular.entity.Trabajo;
import com.twtspain.aplicacion.angular.PruebaAngular.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Empleado> findAll() {
		
		return empleadoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado findById(Long id) {
		
		return empleadoRepository.getById(id);
	}

	@Override
	@Transactional
	public Empleado save(Empleado empleado) {
		
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> findAllDepartamentos() {
	
		return empleadoRepository.findAllDepartamentos();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Trabajo> findAllTrabajos() {
		
		return empleadoRepository.findAllTrabajos();
	}

}
