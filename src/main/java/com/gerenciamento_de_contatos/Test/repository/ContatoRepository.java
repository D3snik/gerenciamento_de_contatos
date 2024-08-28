package com.gerenciamento_de_contatos.Test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gerenciamento_de_contatos.Test.entitties.Contato;

	public interface ContatoRepository extends MongoRepository<Contato, String> {
		
	}

