package exercicios;

import java.util.Scanner;

public class Exercicio15SwitchDiasDaSemana {

	public static void main(String[] args) {
		Scanner diaDaSemana = new Scanner(System.in);
		int semana;
		System.out.println("Digite o dia da semana de 1 a 7: ");
		do {

			semana = diaDaSemana.nextInt();

			switch (semana) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Valor inválido. Digite um número de 1 a 7.");
				break;
			}
		} while (semana < 1 || semana > 7);
		diaDaSemana.close();
	}
}
