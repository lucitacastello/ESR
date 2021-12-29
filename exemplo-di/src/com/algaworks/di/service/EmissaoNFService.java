package com.algaworks.di.service;

import com.algaworks.di.model.Cliente;
import com.algaworks.di.model.Produto;
import com.algaworks.di.notificacao.Notificador;

public class EmissaoNFService {

	private Notificador notificador;

	public EmissaoNFService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void emitir(Cliente cliente, Produto produto) {
		// TODO emitir NF aqui

		this.notificador.notificar(cliente, "NF do produto " + 
				produto.getNome() + " foi emitida!");
	}

}
