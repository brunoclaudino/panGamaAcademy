package com.gama.academy.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gama.academy.consultorio.model.Consulta;
import com.gama.academy.consultorio.model.Medico;
import com.gama.academy.consultorio.repository.ConsultaRepository;
import com.gama.academy.consultorio.repository.MedicoRepository;

@Service
public class ConsultaService implements InterfaceConsultaService{
	@Autowired
	ConsultaRepository consultaRepo;
	@Autowired
	MedicoRepository medicoRepo;

	@Override
	public List<Consulta> obterTodos() {
		return this.consultaRepo.findAll();
	}

	@Override
	public Consulta obterPorCod(String cod) {
		return this.consultaRepo.findById(cod).orElseThrow(() -> new IllegalArgumentException("Consulta Inexistente"));
	}

	@Override
	public Consulta criarConsulta(Consulta consulta) {
		Medico med = this.medicoRepo.findById(consulta.getMedico().getId()).orElseThrow(() -> new IllegalArgumentException("Medico inexistente"));
		consulta.setMedico(med);
		
		return this.consultaRepo.save(consulta);
	}

	@Override
	public Consulta deletarConsulta(String id) {
		 Consulta retorno = obterPorCod(id);
		 this.consultaRepo.deleteById(id);
		 return retorno;
	}

	@Override
	public Consulta remarcarConsulta(String id, String data) {
		Consulta retorno = obterPorCod(id);
		retorno.setData(data);
		return this.consultaRepo.save(retorno);
	}
	
}
