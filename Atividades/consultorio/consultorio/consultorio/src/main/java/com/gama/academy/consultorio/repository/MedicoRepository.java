package com.gama.academy.consultorio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gama.academy.consultorio.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String>{

}
