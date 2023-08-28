package br.com.geekuniversity.secao22;

import java.util.function.Consumer;

public class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}
