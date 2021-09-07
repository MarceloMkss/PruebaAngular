package com.twtspain.aplicacion.angular.PruebaAngular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Departamento;
import com.twtspain.aplicacion.angular.PruebaAngular.repository.DepartamentoRepository;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	
	@Override
	public List<Departamento> findAll() {
	
		return departamentoRepository.findAll();
	}

	@Override
	public Departamento findById(Long id) {
		
		return departamentoRepository.getById(id);
	}

	@Override
	public Departamento save(Departamento departamento) {
		
		return departamentoRepository.save(departamento);
	}

}
