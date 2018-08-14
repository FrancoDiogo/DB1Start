package br.com.db1;

public class DivisaoPorZero extends ArithmeticException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4447299179425904808L;
	
	@Override
	public String getMessage() {
		return "Divisao por zero";
	}
}