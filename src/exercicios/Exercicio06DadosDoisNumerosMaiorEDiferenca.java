package exercicios;

public class Exercicio06DadosDoisNumerosMaiorEDiferenca {

	public static void main(String[] args) {
		int numero1 = 8;
		int numero2 = 18;
		if (numero1 > numero2) {
			System.out.println("O número maior é: " + numero1);
			System.out.println("A diferença entre " + numero1 + " e " + numero2 + " é igual a: " + (numero1 - numero2));

		} else {
			System.out.println("O número maior é: " + numero2);
			System.out.println("A diferença entre " + numero1 + " e " + numero2 + " é igual a: " + (numero2 - numero1));

		}

	}
}
