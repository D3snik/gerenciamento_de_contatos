package com.gerenciamento_de_contatos.Test.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ContatoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handlerNotFound(ContatoNotFoundException ex) {
		return ex.getMessage();
	}
}
