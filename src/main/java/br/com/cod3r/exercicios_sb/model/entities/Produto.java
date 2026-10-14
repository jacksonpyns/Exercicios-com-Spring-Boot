package br.com.cod3r.exercicios_sb.model.entities;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cod3r.exercicios_sb.model.repositories.ProdutoRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// Significa que o produto vai ter sua própria sequência de id único

	private String nome;
	
	@Autowired
	@Transient
	public ProdutoRepository repository;
	
	public Produto() {
		
	}
	
	public Produto(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
