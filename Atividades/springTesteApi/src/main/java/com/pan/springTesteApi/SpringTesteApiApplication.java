package com.pan.springTesteApi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pan.springTesteApi.model.Produto;
import com.pan.springTesteApi.repositories.ProdutoRepository;

@SpringBootApplication
public class SpringTesteApiApplication implements CommandLineRunner{
	@Autowired
	ProdutoRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(SpringTesteApiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Produto u1 = new Produto("Sabão", 2.43, "Ypê");
		Produto u2 = new Produto("Desodorante", 14.34, "Old Spice");
		Produto u3 = new Produto("Suco de Laranja", 11.99, "Agua da Serra");
		
		repositorio.saveAll(Arrays.asList(u1, u2, u3));
	}

}
