package exercicios;

import java.util.Scanner;

public class Exercicio14NotaFinal {

	public static void main(String[] args) {
		int lab = 2;
		int sem = 3;
		int fim = 5;

		Scanner laboratorio = new Scanner(System.in);
		System.out.println("Digite a nota do trabalho de laboratório: ");
		int notaLaboratorio = laboratorio.nextInt();
		if (notaLaboratorio == 0) {
			lab = 0;
		}

		Scanner semestral = new Scanner(System.in);
		System.out.println("Digite a nota da avaliação semestral: ");
		int notaSemestral = semestral.nextInt();
		if (notaSemestral == 0) {
			sem = 0;
		}

		Scanner exame = new Scanner(System.in);
		System.out.println("Digite a nota do exame final: ");
		int notaExame = exame.nextInt();
		if (notaExame == 0) {
			fim = 0;
		}

		laboratorio.close();
		semestral.close();
		exame.close();

		int media = (notaLaboratorio + lab + notaSemestral + sem + notaExame + fim) / 4;
		System.out.println(media);

		if (media <= 2.9) {
			System.out.println("A sua média final foi: " + media + ". Que pena! Você foi reprovado!!!");
		} else if (media <= 4.9) {
			System.out.println("A sua média final foi: " + media + ". Você está de recuperação!");
		} else {
			System.out.println("A sua média final foi: " + media + ". Parabéns! Você foi aprovado!!!");
		}
	}
}
