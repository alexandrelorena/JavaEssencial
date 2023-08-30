package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes Anônimas

/*
Classes anônimas são classes sem nome. 

Quando utilizar?

- Utilizamos classes anônimas quando temos interfaces com um
ou poucos métodos e não precisamos reaproveitar o código da classe.

Ou seja, se não iremos precisar reaproveitar a classe em um outro lugar
do nosso sistema e esta classe que eu deveria criar iria apenas implementar
uma interface com um ou poucos métodos, podemos utilizar o conceito de 
classe anônima.
*/
public class Programa69 {

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

		Consumer<String> consumidor = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		};
		
		palavras.forEach(consumidor);

	}
}
