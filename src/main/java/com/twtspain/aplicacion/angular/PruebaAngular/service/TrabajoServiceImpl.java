package com.twtspain.aplicacion.angular.PruebaAngular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Trabajo;
import com.twtspain.aplicacion.angular.PruebaAngular.repository.TrabajoRepository;

@Service
public class TrabajoServiceImpl implements TrabajoService {

	@Autowired
	private TrabajoRepository trabajoRepository;

	@Override
	public List<Trabajo> findAll() {

		return trabajoRepository.findAll();
	}

	@Override
	public Trabajo findById(String id) {

		return trabajoRepository.getById(id);
	}

	@Override
	public Trabajo save(Trabajo trabajo) {

		return trabajoRepository.save(trabajo);
	}

}
