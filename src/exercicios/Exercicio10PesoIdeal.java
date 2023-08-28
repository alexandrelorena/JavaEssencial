package exercicios;

import java.util.Scanner;

public class Exercicio10PesoIdeal {

	public static void main(String[] args) {
		Scanner altura = new Scanner(System.in);
		System.out.println("Digite a sua altura: ");
		float alt = altura.nextFloat();

		Scanner sexo = new Scanner(System.in);
		System.out.println("Digite o seu sexo (M) ou (F): ");
		String sex = sexo.next();

		altura.close();
		sexo.close();

		System.out.println("O seu sexo é: " + sex + " e a sua altura é: " + alt);

		if (sex.equals("M")) { // Usar .equals() para comparar strings, e não o operador de atribuição "="
			double pesoIdeal = (72.7 * alt) - 58; // Corrigir a fórmula para calcular o peso ideal
			System.out.println("O seu peso ideal é: " + pesoIdeal);
		} else {
			double pesoIdeal = (62.1 * alt) - 44.7; // Corrigir a fórmula para calcular o peso ideal
			System.out.println("O seu peso ideal é: " + pesoIdeal);
		}

	}
}
