package br.com.cod3r.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exercicios_sb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes") // Nao vai precisar colocar o /clientes no GetMapping,
public class ClienteController { // porque ja vai automatico

	// Teria que colocar o "/clientes/qualquer"
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}
	
	@GetMapping
	public Cliente obterClintePorId2(
			@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "João Augusto", "111.222.333-44");
	}
}
