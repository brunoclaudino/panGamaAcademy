package com.pan.sprintTesteApiApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pan.springTesteApi.model.Produto;
import com.pan.springTesteApi.repositories.ProdutoRepository;

@Service
public class ProdutoServices {
	@Autowired
	private ProdutoRepository repositorio;
	
	public Produto findById(Integer id) {
		Optional<Produto> obj = repositorio.findById(id);
		return obj.orElse(null);
	}
	
	public List<Produto> findAll(){
		return repositorio.findAll();
	}
	
	public Produto update(Integer id, Produto obj) {
		Produto newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setPreco(obj.getPreco());
		newObj.setMarca(obj.getMarca());
		return repositorio.save(newObj);
	}
	
	public void delete(Integer id) {
		findById(id);
		repositorio.deleteById(id);
	}
	
	public Produto create(Produto obj) {
		obj.setId(null);
		return repositorio.save(obj);
	}

}
