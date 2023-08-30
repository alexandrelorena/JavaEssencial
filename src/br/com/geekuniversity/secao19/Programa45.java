package br.com.geekuniversity.secao19;
/*
Arrays (Vetore/Matrizes)

- Um array tem tamanho fixo. Ou seja, se criarmos um array com 5
elementos ele terá sempre no máximo 5 elementos.

- Um array tem tipo de dado fixo. Ou seja, se criarmos um array de inteiros
ele só poderá ter inteiros.

- É difícil encontrar um determinado elemento em um array. Precisamos para isso
varrer todo o array através do seu índice, caso não façamos busca pelo índice.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Colections (Coleções)

- Java possui diversas classes/interfaces que faciliam muito o trabalho quando
se trata de coleções de dados. Essas classes/interfaces são chamadas de Collections (Coleções)
*/

/*
Listas

- Aceitam repetição de valores;
- Possuem tamanho 'infinito' (Depende da memória);
- Podemos adicionar valores de qualquer tipo, desde que não especificamos um tipo na declaração;
 
*/
public class Programa45 {

	public static void main(String[] args) {
		//ArrayList nomes = new ArrayList(); //Sem definir tipo de dado, podemos colocar qualquer tipo
		List<String> nomes = new ArrayList<String>(); //Definimos o tipo String
		
		nomes.add("Maria"); //0
		nomes.add("Felicity");
		nomes.add("Angelina"); //2
		nomes.add("Geek");
		nomes.add("Maria"); //4
		nomes.add("Angelina"); //5
		
//		nomes.add(44);
//		nomes.add(true);
//		nomes.add(12.4);
//		nomes.add('e');
		
		//System.out.println(nomes.get(0));
		//System.out.println(nomes.get(3));
		
		//System.out.println(nomes.size());
		
//		for(int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
		
		Collections.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}

	}

}
