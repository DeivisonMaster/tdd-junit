package br.com.tdd.controller;

import br.com.tdd.model.Pessoa;
import br.com.tdd.service.ServicePessoa;
import br.com.tdd.util.GeradorDeLog;

public class PessoaController {
	private GeradorDeLog log;
	private ServicePessoa servicePessoa = new ServicePessoa(log);

	public void exclui(Pessoa pessoa) {
		servicePessoa.exclui(pessoa);
	}

}
