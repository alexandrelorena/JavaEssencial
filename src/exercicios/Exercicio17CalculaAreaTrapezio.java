package exercicios;

import java.util.Scanner;

public class Exercicio17CalculaAreaTrapezio {

	public static void main(String[] args) {
		Scanner trapezio = new Scanner(System.in);
		System.out.println("Vamos calcular a área de um trapézio. Digite um número para a base maior: ");
		int baseMaior = trapezio.nextInt();

		System.out.println("Agora digite um número para a base menor: ");
		int baseMenor = trapezio.nextInt();

		System.out.println("Agora a altura: ");
		double altura = trapezio.nextDouble();

		double area = ((baseMaior + baseMenor) * altura) / 2;

		System.out.println("A area do trapézio é: " + area);

		trapezio.close();
	}
}
