package com.algaworks.algafood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;


@Component
public class AtivacaoClienteService {

	@Qualifier("urgente")
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
	
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
	@PostConstruct
	public void init() { System.out.println("INIT"); }
	
	@PreDestroy
	public void destroy() { System.out.println("DESTROY"); }

}