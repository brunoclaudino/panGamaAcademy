package com.gama.academy.consultorio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gama.academy.consultorio.model.Consulta;

public interface ConsultaRepository extends MongoRepository<Consulta, String>{

}
