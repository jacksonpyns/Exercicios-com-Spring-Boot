package br.com.cod3r.exercicios_sb.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// Significa que o produto vai ter sua própria sequência de id único

	@NotBlank 
	private String nome;
	// Aqui serve para validar que esse valor seja diferente de vazio
	
	@Min(value = 0)
	private double preco;
	// Aqui o faz com que o preco mínimo deverá ser o valor 0
	
	@Min(0)
	@Max(1)
	private double desconto;
	// Aqui faz com que o valor mínimo seja 0 e o máximo seja 1 do desconto
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
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
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
