package br.com.geekuniversity.secao22;

/*
A gente está criando nosso próprio comparador de objetos (Strings)
para que seja possível, desta forma, ordenar a string pelo seu tamanho
ao invés de ordem alfabética.

1 - A string1 é menor que a string2 -> retornamos -1
2 - A string1 é maior que a string2 -> retornamos 1
3 - A string1 tem o mesmo tamanho da string2 -> retornamos 0
 
*/
import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		//1 - A string1 é menor que a string2 -> retornamos -1
		if(s1.length() < s2.length()) {
			return -1;
		}
		//2 - A string1 é maior que a string2 -> retornamos 1
		if(s1.length() > s2.length()){
			return 1;
		}
		//3 - A string1 tem o mesmo tamanho da string2 -> retornamos 0
		return 0;
	}

}
