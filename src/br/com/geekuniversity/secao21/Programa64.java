package br.com.geekuniversity.secao21;
//Conjuntos

import java.util.LinkedList;

/*
Uma das características dos conjuntos é a não aceitação de
elementos repetidos. 

Gera performance.

A = ["Angelina", "Angela", "Adriano" ...];
B = ["Bárbara", "Beatriz", "Barnabé" ...];
C = ["Cássia", "Camila", "Carlos" ...];
D = ["Daniela", "Daniel", "Danilo" ...];
E = ["Elisângela", "Elisabete", "Elias" ...];
F = ["Fabiana", "Francisca", "Fábio" ...];
.
.
.
Z = ["Zuleica", "Zagalo", "Zamael" ...];

 0  1  2  3  4  5  6  7
[a][n][g][e][l][i][n][a]

8 / 2 -> 4
4 / 2 -> 2
2 / 2 -> 0
*/

@SuppressWarnings("unused")
public class Programa64 {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();

		System.out.println(conjunto);

		conjunto.adiciona("Angelina");

		System.out.println(conjunto);

		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Júlia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity"); // Não entra repetido

		conjunto.remove("Juvenal");

		System.out.println(conjunto);

	}

}
