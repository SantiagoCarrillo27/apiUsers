package com.pruebaApi1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaApi1.model.Persona;
import com.pruebaApi1.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personarepo;
	
	
	public List<Persona> listarPersonas() {
		return personarepo.findAll();
	}
	
	
	public Persona crearPersona(Persona persona) {
		return personarepo.save(persona);
	}

	public Persona buscarPersonaPorId(Long id){
		return personarepo.findById(id).orElse(null);
	}
	
	public void borrarPersona(Long id) {
		  personarepo.deleteById(id);
	}
	
	public void actualizarPersona(Persona persona) {
		 personarepo.save(persona);
	}
	

}