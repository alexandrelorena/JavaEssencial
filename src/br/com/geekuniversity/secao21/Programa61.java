package br.com.geekuniversity.secao21;

import java.util.Stack;

//Pilhas - Implementação do Java
public class Programa61 {

	public static void main(String[] args) {
		Stack<String> nomes = new Stack<String>();
		
		System.out.println(nomes);
		nomes.push("Angelina"); //insere
		nomes.push("Felicity");
		System.out.println(nomes);
		
		String ret = nomes.peek(); //Retorna o elemento do topo
		System.out.println(ret);
		System.out.println(nomes);
		
		String r1 = nomes.pop(); //remove
		System.out.println(r1);
		System.out.println(nomes);
		
		

	}

}
