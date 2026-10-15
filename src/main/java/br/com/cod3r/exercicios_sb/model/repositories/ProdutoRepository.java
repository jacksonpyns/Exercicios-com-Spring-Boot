package br.com.cod3r.exercicios_sb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

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
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	// É para fazer consultas através de partes do nome
	// Ele usa o próprio SpringBoot para fazer as alterações tipo o IgnoreCase
	
//	 findByNomeContaining
//	 findByNomeIsContaining
//	 findByNomeContains
//	
//	 findByNomeStartWith
//	 findByNomeEndsWith
//	
//	 findByNomeNotContaining
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
	
}
