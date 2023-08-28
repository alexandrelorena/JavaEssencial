package exercicios;

import java.util.Scanner;

public class CalculoIndiceMassaCorporea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o seu peso em kg: ");
		double peso = scanner.nextDouble();

		System.out.print("Digite a sua altura em metros: ");
		double altura = scanner.nextDouble();

		double imc = peso / (altura * altura);

		System.out.println("O seu IMC é: " + imc);

		// Classificações
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso!");
		} else if (imc < 25) {
			System.out.println("Você está com o peso normal!");
		} else if (imc < 30) {
			System.out.println("Você está com sobrepeso!");
		} else if (imc < 35) {
			System.out.println("Você está com obesidade Grau I!");
		} else if (imc < 40) {
			System.out.println("Você está com obesidade Grau II (severa)!");
		} else {
			System.out.println("Você está com obesidade Grau III (mórbida)!");
		}

		scanner.close();
	}
}
