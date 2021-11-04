package com.gama.academy.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gama.academy.consultorio.model.Medico;
import com.gama.academy.consultorio.service.MedicoService;

@RestController
@RequestMapping(path = "/medicos")
public class MedicoController {
	@Autowired
	private MedicoService medService;
	
	@GetMapping
	public List<Medico> obterTodos() {
		return this.medService.obterTodos();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Medico> obterPorCodigo(@PathVariable String id) {
		Medico obj = this.medService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Medico criar(@RequestBody Medico med) {
		return this.medService.criarMed(med);
	}
}
