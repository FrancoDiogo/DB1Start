package br.com.db1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TextoTest {
	
	private Texto texto = new Texto();
	
	@Test
	public void letraMaiusculaTest() {
		assertEquals("DB1START", texto.letraMaiuscula("db1start"));
	}
	
	@Test
	public void letraMinusculaTest() {
		assertEquals("db1start", texto.letraMinuscula("db1START"));
	}
	
	@Test
	public void quantidadeCaracteresTest() {
		assertTrue(8 == texto.quantidadeCaracteres("DB1START"));
		assertFalse(5 == texto.quantidadeCaracteres("DB1START"));
		assertTrue(10 == texto.quantidadeCaracteres(" DB1START "));
		assertFalse(11 == texto.quantidadeCaracteres(" DB1START "));
	}
	
	@Test
	public void quantidadeCaracteresMenosEspacoTest() {
		assertTrue(8 == texto.quantidadeCaracteresMenosEspaco(" DB1START "));
		assertFalse(10 == texto.quantidadeCaracteresMenosEspaco(" DB1START "));
	}
	
	@Test
	public void nomeCompleto4PrimeirasLetrasTest() {
		assertEquals("Diog", texto.nomeCompleto4PrimeirasLetras("Diogo Pelegrine Facci Franco"));
	}
	
	@Test
	public void nomeCompletoTerceiraLetraTest() {
		assertEquals("ogo Pelegrine Facci Franco", texto.nomeCompletoTerceiraLetra("Diogo Pelegrine Facci Franco"));
	}
	
	@Test
	public void nomeCompleto4UltimasLetrasTest() {
		assertEquals("anco", texto.nomeCompleto4UltimasLetras("Diogo Pelegrine Facci Franco"));
	}
	
	@Test
	public void nomeCompletoAlunoAluna() {
		assertEquals("ALUNO/ALUNA Pelegrine Facci Franco", texto.nomeCompletoAlunoAluna("Diogo Pelegrine Facci Franco"));
	}
	
	@Test
	public void separarTexto() {
		String[] separa = texto.separarTexto("banana, maca, melancia");
		assertEquals("banana", separa[0]);
		assertEquals("maca", separa[1]);
		assertEquals("melancia", separa[2]);
	}
	
	@Test
	public void qtdadeVogais() {
		assertTrue(1 == texto.qtdadeVogais("DB1 Start"));
		assertFalse(2 == texto.qtdadeVogais("DB1 Start"));
		assertTrue(2 == texto.qtdadeVogais("DB1A Start"));
		assertFalse(3 == texto.qtdadeVogais("DB1A Start"));
	}
	
	@Test
	public void textoInvertido() {
		assertEquals("trats 1bd", texto.textoInvertido("db1 start"));
	}
}