package com.gama.academy.consultorio.service;

import java.util.List;

import com.gama.academy.consultorio.model.Medico;

public interface InterfaceMedicoService {
	public List<Medico> obterTodos();
	
	public Medico obterPorCod(String cod);
	
	public Medico criarMed(Medico med);
}
