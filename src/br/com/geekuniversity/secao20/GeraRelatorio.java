package br.com.geekuniversity.secao20;
/*
Para executar métodos em parelalo, nossa classe 
deve implementar a interface Runnable, e o método
que precisar ser executado em paralelo deve
ser executado dentro do método run 
*/
public class GeraRelatorio implements Runnable {
	
	public void executa() {
		//For 0 até 10 milhões
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " Gerando relatório...aguarde");
		}
	}

	@Override
	public void run() {
		//For 0 até 10 milhões
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " Gerando relatório...aguarde");
		}
	}
}
