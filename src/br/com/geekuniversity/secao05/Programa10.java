package br.com.geekuniversity.secao05;

//Foreach // Para cada
public class Programa10 {

	public static void main(String[] args) {
		String nome = "Geek University";
		
		//Para cada um dos caracteres da string, imprima o caractere
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
			//System.out.print(letra);
		}
	}

}
