package com.gama.academy.consultorio.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Medico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String area;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Medico(String id, String nome, String area) {
		super();
		this.id = id;
		this.nome = nome;
		this.area = area;
	}
	
	public Medico() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(area, id, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(area, other.area) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	

}
