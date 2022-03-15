package br.com.isidrocorp.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.ecommerce.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer>{

}
