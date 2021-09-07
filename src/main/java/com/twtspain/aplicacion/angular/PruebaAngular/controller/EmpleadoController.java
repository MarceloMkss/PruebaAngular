package com.twtspain.aplicacion.angular.PruebaAngular.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Departamento;
import com.twtspain.aplicacion.angular.PruebaAngular.entity.Empleado;
import com.twtspain.aplicacion.angular.PruebaAngular.entity.Trabajo;
import com.twtspain.aplicacion.angular.PruebaAngular.service.EmpleadoService;

@CrossOrigin(origins = { "http://localhost:4200" }) // servidor angular
@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {

		return empleadoService.findAll();

	}

	@GetMapping("/empleados/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {

		Empleado empleado = null;
		Map<String, Object> response = new HashMap<>();
		try {
			empleado = empleadoService.findById(id);

		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (empleado == null) {
			response.put("mensaje", "El empleado ID: ".concat(id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);

	}

	@PostMapping("/vehiculos")
	public ResponseEntity<?> create(@Valid @RequestBody Empleado empleado, BindingResult result) {

		// creo un nuevo cliente
		Empleado empleadoNew = null;
		Map<String, Object> response = new HashMap<>();

		if (result.hasErrors()) {

			List<String> errors = result.getFieldErrors().stream()
					.map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
					.collect(Collectors.toList());

			response.put("errors", errors);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		try {
			empleadoNew = empleadoService.save(empleado);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("mensaje", "El vehiculo ha sido creado con éxito!");
		response.put("vehiculo", empleadoNew);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

	@GetMapping("/empleados/departamentos")
	public List<Departamento> listarDepartamentos() {
		return empleadoService.findAllDepartamentos();
	}

	@GetMapping("/empleados/trabajos")
	public List<Trabajo> listarTrabajos() {
		return empleadoService.findAllTrabajos();
	}

}
