package br.com.geekuniversity.secao20;
//Thread Sincronizada

/*
O sincronismo ocorre pois durante a execução do método a thread
executa um 'lock' (bloqueio) da função para que outra thread
só possa executá-la pós a finalização da thread inicial.
*/
import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1); //saldo 500
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); //500 + 100 -> 600?
		t2.start(); //600 + 100 -> 700?
		
		t1.join(); //avisando que a thread t1 deve 'se juntar' a um sincronizador
		t2.join(); //avisando que a thread t2 deve 'se juntar' a um sincronizador
		
		
		System.out.println(c1);

	}

}
