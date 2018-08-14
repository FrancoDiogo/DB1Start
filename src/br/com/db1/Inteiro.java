package br.com.db1;

public class Inteiro {

	public Integer soma(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

	public Integer subtrai(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}

	public Integer multiplica(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}

	public Integer divide(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}

	public Integer exercicioDivisao(Integer valor1, Integer valor2) throws DivisaoPorZero{
		return valor1 / valor2;		
	}

	public boolean par(Integer valor) {
		return valor % 2 == 0;
	}

	public Integer maior(Integer valor1, Integer valor2) {
		return Math.max(valor1, valor2);
	}

	public Integer imparesAteCem(Integer valor){
		Integer contador = 0;
		for(Integer i = valor; i<100; i = i+2){
			contador++;
		}
		return contador;
	}
}