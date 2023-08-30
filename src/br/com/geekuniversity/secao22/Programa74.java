package br.com.geekuniversity.secao22;
//Method References

/*
Podem ser consideradas simplificações das expressões lambdas. 
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Programa74 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("OutLast 2");
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//Method reference - Forma 1
		//palavras.sort(Comparator.comparing(String::length));
		
		//Method reference - Forma 2
		//Function<String, Integer> tamanho = String::length; //Usando Method References
		Function<String, Integer> tamanho = s -> s.length(); // Usando expressão lambda
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);
		
		//System.out.println(palavras);
		
		palavras.forEach(System.out::println); //Method references
	}
}
