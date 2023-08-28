package exercicios;

import java.util.Scanner;

public class Exercicio04RaizQuadradaENumeroAoQuadradoDeNumeroPositivo {

	public static void main(String[] args) {
		Scanner numeroPositivo = new Scanner(System.in);
		int input;
		do {
			System.out.println("Digite um número: ");
			input = numeroPositivo.nextInt();

			if (input >= 0) {
				double quadrado = Math.pow(input, 2);
				System.out.println("O número " + input + " ao quadrado é: " + quadrado);

				double raizQuadrada = Math.sqrt(input);
				System.out.println("A raiz quadrada de " + input + " é: " + raizQuadrada);
			} else {
				System.out.println("Número inválido! Digite um número positivo!");
			}
		} while (input < 0);
		numeroPositivo.close();
	}
}
