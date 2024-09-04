package com.gerenciamento_de_contatos.Test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciamento_de_contatos.Test.entitties.Contato;
import com.gerenciamento_de_contatos.Test.exceptions.ContatoNotFoundException;
import com.gerenciamento_de_contatos.Test.repository.ContatoRepository;

@Service
public class ContatoServices {

	@Autowired
	private ContatoRepository contatoRepository;
	
	public List<Contato> listarTodos() {
		return contatoRepository.findAll();
	}
	
	public Contato salvar(Contato contato) {
		return contatoRepository.save(contato);
	}
	
	public void deletar(String id) {
		contatoRepository.deleteById(id);
	}
	
	public Contato buscarPorId(String id) {
		return contatoRepository.findById(id)
		 	.orElseThrow(() -> new ContatoNotFoundException("Contato com ID " + id + " não encontrado"));
	}
}
