package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio03RaizQuadradaOuNumeroAoQuadrado {

	public static void main(String[] args) {

		Scanner numeroReal = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int input = numeroReal.nextInt();

		numeroReal.close();

		System.out.println("O número digitado foi: " + input);
		if (input >= 0) {

			double raizQuadrada = Math.sqrt(input);
			System.out.println("O número " + input + " é positivo, e sua raiz quadrada é: " + raizQuadrada);

		} else if (input < 0){
			double quadrado = Math.pow(input, 2);
			System.out.println("O número " + input + " ao quadrado é: " + quadrado);
		}

	}
}
