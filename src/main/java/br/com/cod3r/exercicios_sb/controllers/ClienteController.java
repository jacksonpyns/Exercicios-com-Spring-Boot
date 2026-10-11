package br.com.cod3r.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exercicios_sb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes") // Nao vai precisar colocar o /clientes no GetMapping,
public class ClienteController { // porque ja vai automatico

	// Teria que colocar o "/clientes/qualquer"
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
}
