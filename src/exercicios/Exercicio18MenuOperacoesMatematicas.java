package exercicios;

import java.util.Scanner;

public class Exercicio18MenuOperacoesMatematicas {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int menu;

		System.out.println(
				"Digite de 1 a 4 a operação desejada:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");

		do {
			menu = scanner.nextInt();

			if (menu >= 1 && menu <= 4)
				System.out.println("Você escolheu: " + getMenuDescricao(menu));
			else
				System.out.println("Valor inválido. Digite um número de 1 a 4.");
		} while (menu < 1 || menu > 4);

		System.out.println("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();

		System.out.println("Digite o segundo número: ");
		int numero2 = scanner.nextInt();

		String operador = getOperador(menu);
		double resultado = calcularOperacao(numero1, numero2, menu);
		System.out.println("O resultado da operação: " + numero1 + "" + operador + "" + numero2 + " = " + resultado);

	}

	static double calcularOperacao(int numero1, int numero2, int menu) {
		switch (menu) {
		case 1:
			return numero1 + numero2;
		case 2:
			return numero1 - numero2;
		case 3:
			return numero1 * numero2;
		case 4:
			return (double) numero1 / numero2;
		default:
			throw new IllegalArgumentException("Operação inválida.");
		}
	}

	static String getMenuDescricao(int menu) {
		switch (menu) {
		case 1:
			return "soma";
		case 2:
			return "subtração";
		case 3:
			return "multiplicação";
		case 4:
			return "divisão";
		default:
			throw new IllegalArgumentException("Operação inválida.");
		}
	}

	static String getOperador(int menu) {
		switch (menu) {
		case 1:
			return "+";
		case 2:
			return "-";
		case 3:
			return "*";
		case 4:
			return "/";
		default:
			throw new IllegalArgumentException("Operação inválida.");
		}
	}
}
