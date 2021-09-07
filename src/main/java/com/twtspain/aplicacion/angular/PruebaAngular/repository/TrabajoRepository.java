package com.twtspain.aplicacion.angular.PruebaAngular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twtspain.aplicacion.angular.PruebaAngular.entity.Trabajo;

@Repository
public interface TrabajoRepository extends JpaRepository<Trabajo, String> {

}
