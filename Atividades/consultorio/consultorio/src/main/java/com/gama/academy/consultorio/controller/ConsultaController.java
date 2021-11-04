package com.gama.academy.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gama.academy.consultorio.model.Consulta;
import com.gama.academy.consultorio.service.ConsultaService;

@RestController
@RequestMapping(path = "/consultas")
public class ConsultaController {
	@Autowired
	private ConsultaService consultaService;
	
	@GetMapping
	public List<Consulta> obterTodos() {
		return this.consultaService.obterTodos();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Consulta> obterPorCodigo(@PathVariable String id) {
		Consulta obj = this.consultaService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Consulta criar(@RequestBody Consulta consulta) {
		return this.consultaService.criarConsulta(consulta);
	}
	
	@DeleteMapping(value = "/{id}")
	public Consulta deletar(@PathVariable String id) {
		return this.consultaService.deletarConsulta(id);
	}
	
	@PutMapping(value = "/{id}")
	public Consulta remarcar(@PathVariable String id, @RequestBody Consulta consulta){
		return this.consultaService.remarcarConsulta(id, consulta.getData());
	}

}
