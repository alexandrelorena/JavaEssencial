package br.com.geekuniversity.secao21;
//Lista Ligada / LinkedList

/*
Em um vetor, os elementos estão um do lado do outro, enquanto em uma lista
ligada, eles estão em lugares diferentes, porém um aposta para o outro
indicando o próximo elemento. 

[1, 2, 3, ]
*/
public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);

		lista.adiciona("Angelina");
		System.out.println(lista);
		lista.adiciona("Maria");
		lista.adiciona("Felicity");
		System.out.println(lista);
		lista.removeDoComeco();
		System.out.println(lista);

	}

}
