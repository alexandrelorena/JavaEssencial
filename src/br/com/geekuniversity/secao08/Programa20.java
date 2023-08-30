package br.com.geekuniversity.secao08;

import java.util.Scanner;

//Criando nossas próprias funções

/*
Faça um programa, que receba diversos nomes
de frutas do usuário e no final imprima essas
frutas em ordem contrária. O programa deve
solicitar ao usuário quantas frutas ele quer
informar. 

Informe quantas frutas deseja cadastrar:
2

Informe o nome de uma fruta:
Manga

Informe o nome de uma fruta:
Goibaba

Goiaba
Manga
*/

public class Programa20 {
	//Variávels globais
	//Declaração do vetor
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Variável Local
		int qtd;
		
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		
		mostrar_dados(qtd);
		
		
		teclado.close();
	}
	
	/*
	 Uma função deve ter o seguinte:
	 a) Tipo de retorno (Tipo de dado que a função vai retornar);
	 b) Nome - Corresponde a ação que a função realiza;
	 c) Parâmetros/Argumentos de entrada (Opcional);
	 d) Retorno (Opcional - depende do tipo de retorno);
	*/
	//void = vazio
	static void cadastrar_dados(int quantidade) {
		//Definindo o tamanho do vetor
		frutas = new String[quantidade];
				
		//3
		//0..2 (0, 1, 2)
		for(int i = 0; i < quantidade; i++) { //i++ -> i = i + 1
			System.out.println("Informe a "+ (i + 1) + " fruta: ");
			frutas[i] = teclado.nextLine();
		}
	}
	
	static void mostrar_dados(int quantidade) {
		for(int i = (quantidade - 1); i >= 0; i--) { //i-- -> i = i - 1
			System.out.println(frutas[i]);
		}
	}
}
