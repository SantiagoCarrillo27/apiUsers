package com.pruebaApi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebaApi1.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	
	
}
