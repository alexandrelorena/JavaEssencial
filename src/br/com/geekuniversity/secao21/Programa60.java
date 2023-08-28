package br.com.geekuniversity.secao21;
//Pilhas

/*
São estruturas de dados onde o elemento que está visível/disponível é o que
está sempre no topo.

Os elementos, ao serem adicionados em uma pilha, são adicionados sempre no topo.

Para remover elementos da pilha, só podemos remover o topo.

O último elemento a entrar é o primeiro a sair.

[1]
[0]
*/
public class Programa60 {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.insere("Angelina");
		pilha.insere("Felicity");
		
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println(ret);
		
		String r1 = pilha.remove();
		System.out.println(r1);
		
		System.out.println(pilha);
		
		pilha.remove();
		System.out.println(pilha.vazia());

	}

}
