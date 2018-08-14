package br.com.db1;

public class Texto {

	public String letraMaiuscula(String parametro) {
		return parametro.toUpperCase();
	}

	public String letraMinuscula(String parametro) {
		return parametro.toLowerCase();
	}

	public Integer quantidadeCaracteres(String parametro) {
		return parametro.length();
	}

	public Integer quantidadeCaracteresMenosEspaco(String parametro) {
		return parametro.trim().length();
		//replace?
	}

	public String nomeCompleto4PrimeirasLetras(String parametro) {
		return parametro.substring(0, 4);
	}

	public String nomeCompletoTerceiraLetra(String parametro) {
		return parametro.substring(2);
	}

	public String nomeCompleto4UltimasLetras(String parametro) {
		return parametro.substring(parametro.length() -4);
	}

	public String nomeCompletoAlunoAluna(String parametro) {
		String[] texto = parametro.split("Diogo");
		return "ALUNO/ALUNA" + texto[1];//pq texto[1]?
	}

	public String[] separarTexto(String parametro) {
		return parametro.split(", ");
	}

	public Integer qtdadeVogais(String parametro) {
		return parametro.replaceAll("[^aeiouAEIOU]", "").length();
	}

	public String textoInvertido(String parametro) {
		StringBuilder sb = new StringBuilder(parametro);
		return sb.reverse().toString();
	}
}