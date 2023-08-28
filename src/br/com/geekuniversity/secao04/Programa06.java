package br.com.geekuniversity.secao04;

// Instrução Switch
public class Programa06 {
	public static void main(String[] args) {
		int numero = 3;
		
		switch (numero) {
			case 1:
				System.out.println("O número é 1");
				break;
			case 3:
				System.out.println("O número é 3");
				break;
			case 5:
				System.out.println("O número é 5");
				break;
			default:
				System.out.println("[Default] O número é " +  numero);
				break;
			}
	}
}
