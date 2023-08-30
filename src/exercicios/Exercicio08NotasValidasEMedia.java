package exercicios;

import java.util.Scanner;

public class Exercicio08NotasValidasEMedia {

	public static void main(String[] args) {
		Scanner notas = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = notas.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double nota2 = notas.nextDouble();
		if (nota1 >= 0.0 && nota1 <= 10.0 && nota2 >= 0.0 && nota2 <= 10.0) {

			System.out.println("A primeira nota digitada foi: " + nota1);
			System.out.println("A segunda nota digitada foi: " + nota2);
			System.out.println("A média das notas é: " + (nota1 + nota2) / 2);

		} else {
			System.out.println("A nota digitada não é válida. Programa terminado!  ");

		}

		notas.close();
	}

}
