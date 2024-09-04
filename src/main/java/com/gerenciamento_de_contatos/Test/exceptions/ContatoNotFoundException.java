package com.gerenciamento_de_contatos.Test.exceptions;

public class ContatoNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ContatoNotFoundException(String message) {
		super(message);
	}
}
