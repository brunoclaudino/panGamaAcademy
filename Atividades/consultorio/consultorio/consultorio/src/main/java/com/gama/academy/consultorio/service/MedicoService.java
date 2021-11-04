package com.gama.academy.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gama.academy.consultorio.model.Medico;
import com.gama.academy.consultorio.repository.MedicoRepository;

@Service
public class MedicoService implements InterfaceMedicoService{
	@Autowired
	MedicoRepository medRepo;

	@Override
	public List<Medico> obterTodos() {
		return this.medRepo.findAll();
	}

	@Override
	public Medico obterPorCod(String cod) {
		return this.medRepo.findById(cod).orElseThrow(() -> new IllegalArgumentException("Medico inexistente"));
	}

	@Override
	public Medico criarMed(Medico med) {
		return this.medRepo.save(med);
	}

}
