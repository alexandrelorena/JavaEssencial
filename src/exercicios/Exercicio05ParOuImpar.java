package exercicios;

import java.util.Scanner;

public class Exercicio05ParOuImpar {

	public static void main(String[] args) {
		Scanner numeroInteiro = new Scanner(System.in);
		int input;
		// do {
		System.out.println("Digite um número: ");
		input = numeroInteiro.nextInt();

		if (input % 2 == 0) {
			System.out.println("O número " + input + " é par!");
		} else {
			System.out.println("O número " + input + " é ímpar!");
		}
		// } while (input < 0);
		numeroInteiro.close();
	}
}
