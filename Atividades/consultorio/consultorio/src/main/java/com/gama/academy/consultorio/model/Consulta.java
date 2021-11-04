package com.gama.academy.consultorio.model;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Consulta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@NotEmpty
	private String paciente;
	@NotEmpty
	@DBRef
	private Medico medico;
	@NotEmpty
	private String data;
	
	public Consulta() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Consulta(String id, String paciente, Medico medico, String data) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, id, paciente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		return Objects.equals(data, other.data) && Objects.equals(id, other.id)
				&& Objects.equals(paciente, other.paciente);
	}	
	

}
