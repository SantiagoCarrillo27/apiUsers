package com.pruebaApi1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaApi1.model.Persona;
import com.pruebaApi1.service.PersonaService;

@RestController
@RequestMapping("/user")
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/personas")
	public List<Persona> listarPersonas(){
		return personaService.listarPersonas();
		}
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/crear")
	public Persona crearPersona(@RequestBody Persona persona) {
		return personaService.crearPersona(persona);
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/personas/{id}")
	public Persona buscarPersonaPorId(@PathVariable Long id) {
		return  personaService.buscarPersonaPorId(id);
						 
	}
	
	@CrossOrigin("http://localhost:4200")
	@DeleteMapping("/borrar/{id}")
	public void borrarPersonaPorId(@PathVariable Long id) {
		 personaService.borrarPersona(id);
	}
	
	@CrossOrigin("http://localhost:4200")
	@PutMapping("/editar")
	public void editarPersona(@RequestBody Persona persona) {
		personaService.actualizarPersona(persona);
	}
	
	
}
