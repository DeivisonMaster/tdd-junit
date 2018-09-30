package br.com.tdd.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.tdd.model.Calculadora;

public class CalculadoraTeste {
	Calculadora calculadora = new Calculadora();
	
	/* should add two values */
	@Test
	public void deveriaSomarDoisValores() {
		int valueA = 1;
		int valueB = 2;
		int sum   = 0;
		
		sum = calculadora.sum(valueA, valueB);
		
		assertEquals(3, sum);
	}
	
	@Test
	public void deveriaSubtrairDoisValores() {
		int valueA = 2;
		int valueB = 1;
		int subtract   = 0;
		
		subtract = calculadora.subtract(valueA, valueB);
		
		assertEquals(1, subtract);
	}
	
	@Test
	public void deveriaDividirDoisNumeros() {
		int valueA = 4;
		int valueB = 2;
		int division = 0;
		
		division = calculadora.division(valueA, valueB);
		
		assertEquals(2, division);
	}
	
	@Test(expected = ArithmeticException.class)
	public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero() {
		int valueA = 4;
		int valueB = 0;
		int division = 0;
		
		division = calculadora.division(valueA, valueB);
	}
	
	@Test
	public void deveriaMultiplicarDoisNumeros() {
		int valueA = 2;
		int valueB = 3;
		int soma   = 0;
		
		soma = calculadora.multiply(valueA, valueB);
		
		assertEquals(6, soma);
	}
	
	
	
}	





















