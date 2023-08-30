package br.com.geekuniversity.secao20;
//Thread Não Sincronizada (Não é estável)
import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;
/*
Por padrão as threads não são sincronizadas. Pode ocorrer problemas
de uma thread acessar o valor de um objeto que ainda não foi atualizado
ou ainda as threads executarem depois do valor já estar impresso. 
*/
public class Programa53 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1); //saldo 500
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start(); //500 + 100 -> 600?
		t2.start(); //600 + 100 -> 700?
		
		System.out.println(c1);

	}

}
