package exercicios;

import java.util.Scanner;

public class Exercicio13AlgoritimoMediaPonderada {

	public static void main(String[] args) {
		int peso1 = 9;
		int peso2 = 9;
		int peso3 = 12;

		Scanner prova1 = new Scanner(System.in);
		System.out.println("Digite a nota da prova 1: ");
		int avaliacao1 = prova1.nextInt();

		Scanner prova2 = new Scanner(System.in);
		System.out.println("Digite a nota da prova 2: ");
		int avaliacao2 = prova2.nextInt();

		Scanner prova3 = new Scanner(System.in);
		System.out.println("Digite a nota da prova 3: ");
		int avaliacao3 = prova3.nextInt();

		int media = (avaliacao1 * peso1 + avaliacao2 * peso2 + avaliacao3 * peso3) / (3);

		if (media >= 60) {
			System.out.println("A média do aluno é: " + media);
			System.out.println("Você foi aprovado, parabéns!!!");
		} else {
			System.out.println("A média do aluno é: " + media);
			System.out.println("Você foi reprovado, é necessário 60 pontos ou mais!");
		}

		prova1.close();
		prova2.close();
		prova3.close();
	}
}
