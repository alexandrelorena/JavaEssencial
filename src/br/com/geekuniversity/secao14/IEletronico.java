package br.com.geekuniversity.secao14;
/*
Uma interface pode conter:
 - Constantes;
 - Métodos abstratos;
 
 
Interface para servir de contrato para produtos eletrônicos. Todo
produto eletrônico que implementar esta interface OBRIGATORIAMENTE
deverão implementar os métodos abstratos.
*/
public interface IEletronico {
	
	public String MARCA = "Geek"; // Constante
	
	public void ligar();
	
	public void desligar();
}
