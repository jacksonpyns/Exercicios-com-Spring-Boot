package br.com.cod3r.exercicios_sb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exercicios_sb.model.entities.Produto;
import br.com.cod3r.exercicios_sb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired // Aqui o Spring é o responsável por criar um produtoRepository
	private ProdutoRepository produtoRepository;

	@PostMapping
	/*
	 * Este método será chamado sempre que fizer uma requisição
	 * do tipo POST.
	 */
	public @ResponseBody Produto novoProduto(Produto produto) {
		produtoRepository.save(produto); //Agora ele persistirá no MySQL
		return produto;
	}
}
