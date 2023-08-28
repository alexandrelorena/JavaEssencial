package br.com.geekuniversity.secao15;

public class Conta {
	private int numero;
	private String cliente;
	
	public static int contador = 1;
	
	public Conta(String cliente) {
		this.numero = contador;
		this.cliente = cliente;
		Conta.contador = Conta.contador + 1;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public static int proximaConta() {
		return Conta.contador;
	}

}
