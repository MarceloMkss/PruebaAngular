package com.twtspain.aplicacion.angular.PruebaAngular.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trabajos")
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Trabajo implements Serializable {

	// Atributos

	@Id
	
	private String id;

	private String tituloTrabajo;

	private Double salarioMin;

	private Double salarioMax;

	@OneToMany(mappedBy = "trabajo")
	private List<Empleado> listaEmpleados;

	



	private static final long serialVersionUID = -924591774747180996L;

}
