package br.com.db1;

public class Matematica {

	public Double menorValorEntreDois(double valor1, double valor2) {
		return Math.min(valor1, valor2);
	}

	public Double menorValorEntreTres(double valor1, double valor2, double valor3) {
		return Math.min(valor1, Math.min(valor2, valor3));
	}

	public Double mediaTresNum(double valor1, double valor2, double valor3) {
		return (valor1 + valor2 + valor3)/3;
	}

	public Double areaTriangulo(double base, double altura) {
		return (base*altura)/2;
	}	
}