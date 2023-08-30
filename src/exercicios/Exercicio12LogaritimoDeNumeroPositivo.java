package exercicios;

import java.util.Scanner;

public class Exercicio12LogaritimoDeNumeroPositivo {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = numero.nextInt();

		if (num <= 0) {
			System.out.println("Número inválido!");
		} else {
			double resultado = Math.log(num);
			System.out.println("O logaritimo do número " + num + " é: " + resultado);
		}

		numero.close();
	}
}
