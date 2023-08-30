package br.com.geekuniversity.secao21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
0 -> a
1 -> b
.
.
.
25 -> z 
*/

public class Conjunto {
	
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	public Conjunto() {
		for(int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0) % 26;
	}
	
	public void adiciona(String nome) {
		//1 - Verifica se o nome não existe na lista
		if(!contem(nome)) {
			//2 - Calculando o índice do nome
			int indice = calculaIndice(nome);
			//3 - Pegando a lista de acordo com o índice
			List<String> lista = tabela.get(indice);
			//4 - Adiciona o nome na lista correta
			lista.add(nome);
		}
	}
	
	private boolean contem(String nome) {
		//1 - Calculando o índice do nome 
		int indice = calculaIndice(nome);
		//2 - Buscamos na tabela específica do índice o nome
		return tabela.get(indice).contains(nome);
	}
	
	public void remove(String nome) {
		//1 - Verificamos se o nome existe em alguma lista
		if(contem(nome)) {
			//2 - Calculamos o índice do nome
			int indice = calculaIndice(nome);
			//3 - Pegamos a lista específica do nome
			List<String> lista = tabela.get(indice);
			//4 - Removemos o nome da lista
			lista.remove(nome);
		}
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}
}
