package br.com.geekuniversity.secao22;
//Lambdas

/*
Expressões lambdas, são funções anônimas. 

Atalho do Eclipse para identação do código (Organização do código) -> CTRL + Shift + f
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa71 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		Comparator<String> comparador = new ComparadorPorTamanho();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");

		palavras.sort(comparador);

		// Expressão lambda - forma 1
//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});

		// Expressão lambda - forma 2
		palavras.forEach(s -> System.out.println(s));
	}
}
