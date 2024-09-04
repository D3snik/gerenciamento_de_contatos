package com.gerenciamento_de_contatos.Test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciamento_de_contatos.Test.entitties.Contato;
import com.gerenciamento_de_contatos.Test.exceptions.ContatoNotFoundException;
import com.gerenciamento_de_contatos.Test.services.ContatoServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/contato")
public class ContatoController {
	
	@Autowired
	private ContatoServices contatoService;
	
	@GetMapping
	public List<Contato> listTodos() {
		return contatoService.listarTodos();
	}
	
	@PostMapping
	public Contato adicionarContato(@Valid @RequestBody Contato contato) {
		return contatoService.salvar(contato);
	}
	
	@GetMapping("/{id}")
	public Contato buscarPorId(@PathVariable String id) {
		return contatoService.buscarPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable String id) {
		contatoService.deletar(id);
	}
}
