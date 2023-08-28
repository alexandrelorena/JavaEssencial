package exercicios;

import java.util.Scanner;

public class Exercicio07DadosDoisNumerosMaiorEIguais {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número: ");
			int numero1 = scanner.nextInt();

			System.out.println("Digite o segundo número: ");
			int numero2 = scanner.nextInt();

			System.out.println(
					"O primeiro número digitado foi: " + numero1 + "\nO segundo número digitado foi: " + numero2);

			if (numero1 > numero2) {
				System.out.println("O número " + numero1 + " é maior!");

			} else if (numero2 > numero1) {
				System.out.println("O número " + numero2 + " é maior!");

			} else {
				System.out.println("Os números " + numero1 + " e " + numero2 + " são iguais!");

			}

		}
	}

}
