package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produto;



@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setDescricao("computador");
		p.setId(1);
		p.setLinkFoto("img.jpg");
		p.setPreco(100.00);
		p.setQtdeEstoque(20);
		
		return p;
	}
	
	@PostMapping("/novoproduto")
	public String adicionarProduto(@RequestBody Produto novo) {
		System.out.println("debug" + novo);
		return "OK";
	}
	
}
