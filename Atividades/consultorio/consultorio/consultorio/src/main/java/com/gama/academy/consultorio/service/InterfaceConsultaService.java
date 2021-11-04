package com.gama.academy.consultorio.service;

import java.util.List;

import com.gama.academy.consultorio.model.Consulta;

public interface InterfaceConsultaService {
	public List<Consulta> obterTodos();
	
	public Consulta obterPorCod(String cod);
	
	public Consulta criarConsulta(Consulta consulta);
	
	public Consulta deletarConsulta(String id);
	
	public Consulta remarcarConsulta(String id, String data);

}
