package exercicios;

import java.util.Scanner;

public class Exercicio11SomaAlgarismos {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);

		System.out.println("Digite um número maior que 0: ");
		int num = numero.nextInt();

		int soma = 0;
		int numeroRestante = num;

		while (numeroRestante != 0) {
			int digito = numeroRestante % 10;
			soma += digito;
			numeroRestante /= 10;
		}
		if (num > 0) {
			System.out.println("A soma dos algarismos do número " + num + " é: " + soma);

		} else {
			System.out.println("Número inválido. Programa terminado!");

		}

		numero.close();

	}
}
