package br.com.geekuniversity.secao09;
//Construtor

/*
  - O construtor de uma classe SEMPRE tem o mesmo nome da classe;
  - Por padrão, a JVM - Java Virtual Machine, cria em tempo de execução,
  um construtor padrão - um construtor vazio;
  - Podemos ter mais de um construtor na classe;
*/
public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // (Método) Construtor
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
		
		pessoa1.imprime_informacoes();
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina@gmail.com", 1976);
		pessoa2.imprime_informacoes();
		

	}

}
