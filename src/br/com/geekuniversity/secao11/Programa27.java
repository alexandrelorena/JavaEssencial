package br.com.geekuniversity.secao11;
//Private

/*
Privado à própria classe. 

Ou seja, só temos acesso ao atributo ou método privado
dentro da própria classe onde ele foi declarado.
*/
public class Programa27 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(24, "Felicity Jones", "Rua Qualquer 123");
		
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endereço: " + cli1.getEndeco());
		cli1.dizer_oi();
		
		Cliente cli2 = new Cliente(47, "Angelina Jolie", "Rua Outra 345");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endereço: " + cli2.getEndeco());
		cli2.dizer_oi();
	}

}
