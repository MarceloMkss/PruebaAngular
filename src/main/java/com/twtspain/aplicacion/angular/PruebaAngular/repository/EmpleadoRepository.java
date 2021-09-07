package com.twtspain.aplicacion.angular.PruebaAngular.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Departamento;
import com.twtspain.aplicacion.angular.PruebaAngular.entity.Empleado;
import com.twtspain.aplicacion.angular.PruebaAngular.entity.Trabajo;


@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

	@Query("from Departamento")
	public List<Departamento> findAllDepartamentos();
	
	@Query("from Trabajo")
	public List<Trabajo> findAllTrabajos();
	
	
}
