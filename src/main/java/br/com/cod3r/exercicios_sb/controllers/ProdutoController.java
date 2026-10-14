package br.com.cod3r.exercicios_sb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exercicios_sb.model.entities.Produto;
import br.com.cod3r.exercicios_sb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired // Aqui o Spring é o responsável por criar um produtoRepository
	private ProdutoRepository produtoRepository;

	@PostMapping //Se for fazer um POST vem para esse
	/*
	 * Este método será chamado sempre que fizer uma requisição
	 * do tipo POST.
	 */
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto); //Agora ele persistirá no MySQL
		return produto;
	} // O @Valid é para as validações colocadas na classe Produto sejam aplicadas
	
	@GetMapping //Se fizer um GET vem para esse, vai retornar TODOS
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	} // Vai retornar todos os produtos da tabela para o banco de dados
	
	@GetMapping(path="/{id}") //Consegue pegar o produto pelo ID
	// ex: http://localhost/8080/api/produtos/1
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	} /*
	   * O @PathVariable significa que ele vai pegar uma variável que
	   * está dentro do "path" do GetMapping
	   */
	
	@PutMapping //Se for fazer um PUT vem para esse
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	} // Para alterar o objeto inteiro usa-se a requisição do tipo PUT
}
