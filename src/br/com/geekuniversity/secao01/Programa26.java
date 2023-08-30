package br.com.geekuniversity.secao01;
//Public

/*
Publico - Pode ser utilizado em todo o projeto; 


dsfasdfasd

sadfdas
*/
import br.com.geekuniversity.secao11.Cliente;

public class Programa26 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Cliente cli = new Cliente(46, "Angelina Jolie", "Rua da barra, 256");
		
		//System.out.println("Nome: " + cli.nome);//private
		//System.out.println("Endereço: " + cli.endereco); //private
		
		//cli.dizer_oi();//protected
		
		//System.out.println(cli.hashCode());
		
		String t = "Teste";
		int ret = t.toLowerCase().charAt(0);
		
		System.out.println(ret);

	}

}
