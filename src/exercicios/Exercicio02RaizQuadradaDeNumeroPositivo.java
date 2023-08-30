package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio02RaizQuadradaDeNumeroPositivo {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int input;
		do {
		    System.out.println("Digite um número: ");
		    input = numero.nextInt();
		    
		    if (input >= 0) {
		        double raizQuadrada = Math.sqrt(input);
		        System.out.println("A raiz quadrada de " + input + " é: " + raizQuadrada);
		    } else {
		        System.out.println("Número inválido! Digite um número positivo!");
		    }
		} while (input != 0);
		numero.close();
	}
}
