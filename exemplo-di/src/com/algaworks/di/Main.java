package com.algaworks.di;

import com.algaworks.di.model.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@gmail.com", "76545678");
		Cliente maria = new Cliente("Maria", "maria@gmail.com", "87659876");
		
		Notificador notificador = new NotificadorSMS();

		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}

}
