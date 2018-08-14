package br.com.db1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MatematicaTest {
	
	Matematica matematica = new Matematica();

	@Test
	public void menorValorEntreDois() {
		assertTrue(1D == matematica.menorValorEntreDois(1D, 2D));
		assertFalse(2D == matematica.menorValorEntreDois(2D, 1D));
	}
	
	@Test
	public void menorValorEntreTres() {
		assertTrue(1D == matematica.menorValorEntreTres(2D, 1D, 3D));
		assertFalse(2D == matematica.menorValorEntreTres(3D, 2D, 1D));
	}
	
	@Test
	public void mediaTresNum() {
		assertTrue(20D == matematica.mediaTresNum(10D, 20D, 30D));
		assertTrue(25D == matematica.mediaTresNum(5D, 25D, 45D));
	}
	
	@Test
	public void areaTriangulo() {
		assertTrue(25D == matematica.areaTriangulo(5D, 10D));
	}
}