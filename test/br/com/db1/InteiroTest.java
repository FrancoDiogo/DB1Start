package br.com.db1;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class InteiroTest {
	
	Inteiro inteiro = new Inteiro();
	
	@Test
	public void exercicioSomaTest() {
		assertTrue(2 == inteiro.soma(1, 1));
		assertFalse(3 == inteiro.soma(1, 1));
		//System.out.println("Soma " + inteiro.soma(1, 2));vale a pena usar um teste desse?
	}
	
	@Test
	public void exercicioSubtracaoTest() {
		assertTrue(-5 == inteiro.subtrai(5, 10));
		assertFalse(2 == inteiro.subtrai(2, 2));
	}
	
	@Test
	public void exercicioMultiplicacaoTest() {
		assertTrue(0 == inteiro.multiplica(0, 0));
		assertTrue(8 == inteiro.multiplica(2, 4));
		assertFalse(2 == inteiro.multiplica(2, 5));
	}
	
	@Test
	public void exercicioDivisaoTest() throws DivisaoPorZero{
		assertTrue(2 == inteiro.divide(10, 5));
		assertFalse(3 == inteiro.divide(6, 12));
	}
	
	@Test(expected = DivisaoPorZero.class)
	@Ignore
	public void exercicioDivisaoExceptionTest() {
		try {
			inteiro.exercicioDivisao(4, 0);
		} catch (DivisaoPorZero e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void exercicioParTest() {
		assertTrue(inteiro.par(2));
		assertFalse(inteiro.par(3));
	}
	
	@Test
	public void exercicioNumMaiorTest() {
		assertTrue(2 == inteiro.maior(2, 1));
		assertFalse(1 == inteiro.maior(1, 2));
	}
	
	@Test
	public void imparesAteCemTest(){
		assertTrue(inteiro.imparesAteCem(90) == 5);
		assertTrue(inteiro.imparesAteCem(92) == 4);
		assertFalse(inteiro.imparesAteCem(85) == 9);
		assertTrue(inteiro.imparesAteCem(-50) == 75);
	}
}