package br.com.tdd.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.tdd.controller.PessoaController;
import br.com.tdd.model.Pessoa;
import br.com.tdd.util.LogMock;

public class PessoaTeste {

	@Test
	public void deveriaCriarUmLogQuandoUmaPessoaForExcluida() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("alexandre");
		
		LogMock logMock = new LogMock();
		PessoaController pessoaController = new PessoaController();
		pessoaController.exclui(pessoa);
		
		assertEquals(pessoa.getNome(), logMock.getNome());
	}
}
