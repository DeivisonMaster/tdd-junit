package br.com.tdd.service;

import br.com.tdd.dao.PessoaDAO;
import br.com.tdd.model.Pessoa;
import br.com.tdd.util.GeradorDeLog;

public class ServicePessoa {
	private PessoaDAO dao;
	private GeradorDeLog log;
	
	public ServicePessoa(GeradorDeLog log) {
		this.log = log;
	}
	
	public void exclui(Pessoa pessoa) {
		try {
			dao.excluir(pessoa);
			log.criaLog(pessoa.getNome());
		} catch (Exception e) {
			/* DAO Exception ...
			 * LogException ...
			 * 
			 * */
		}
	}
}
