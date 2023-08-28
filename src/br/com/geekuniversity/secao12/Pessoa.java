package br.com.geekuniversity.secao12;
/*
- Classe base
- Classe mãe
- Classe pai
- Super classe 
- Classe genérica
*/

//Agora como classe abstrata
/*
Desta forma, impossibilitamos a criação de objetos desta classe 


Uma classe abstrata pode ter:
	- atributos;
	- Métodos;
	- Métodos abstratos;
	
Métodos abstratos:
	- São métodos, que não possuem implementação, possuem apenas
	declaração, e, obrigatoriamente, as classes que herdarem desta
	classe com métodos abstratos, precisa implementar estes métodos.
*/
public abstract class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoNascimento() {
		return this.ano_nascimento;
	}
	
	public void setAnoNascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Overriding / Sobrescrita de método
	public String toString() {
		return "Nome: " +  this.nome + "\nAno Nascimento: " + this.ano_nascimento;
	}
	
	//Overloading / Sobrecarga de método
	public void mensagem() {
		System.out.println("Esta é a minha mensagem...");
	}
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
	}
	
	//Declaração de um método abstrato
	public abstract void outra_mensagem(String texto);

}
