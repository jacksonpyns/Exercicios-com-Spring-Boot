package br.com.cod3r.exercicios_sb.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.exercicios_sb.model.entities.Produto;

public interface ProdutoRepository 
	extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer> {
	/*
	 *  O primeiro parâmetro "Produto" é o tipo de entidade que este
	 * repositório irá persistir, inserir, alterar e/ou consultar.
	 * 
	 *  O segundo parâmetro "Integer" é o tipo relacionado ao Id do
	 * produto.
	 */
	
	
}
