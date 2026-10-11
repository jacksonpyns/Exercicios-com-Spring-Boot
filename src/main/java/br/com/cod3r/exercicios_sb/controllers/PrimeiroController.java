package br.com.cod3r.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@RequestMapping(path = {"/ola", "/saudacao"})
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	@PostMapping(path = "/saudacao")
	public String saudacao() {
		return "Olá Spring Boot (POST)!";
	}
}
