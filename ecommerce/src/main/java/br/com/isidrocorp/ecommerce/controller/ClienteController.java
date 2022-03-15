package br.com.isidrocorp.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.ecommerce.dao.ClienteDAO;
import br.com.isidrocorp.ecommerce.model.Cliente;

@RestController
public class ClienteController {
	
	@Autowired
	
	private ClienteDAO dao;
	
	@GetMapping("/clientes")
	public List<Cliente> recuperarTodos(){
		return (List<Cliente>)dao.findAll();
	}

}
