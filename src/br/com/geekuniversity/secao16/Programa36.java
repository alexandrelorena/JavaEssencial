package br.com.geekuniversity.secao16;
//Tratando exceções com try/catch

/*
Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que
pode acarretar em um problema.

 Utilizamos o catch para capturar o erro e com isso oferecer ao usuário do sistema
 uma mensagem adequada sem que o sistema quebre.
*/
public class Programa36 {

	public static void main(String[] args) {
		int numeros[] = new int[5];//0..4 -> 0, 1, 2, 3, 4 -> n - 1
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}
		
		for(int i = 0; i <= numeros.length; i++) {
			try { //Tente fazer isso
				System.out.println(numeros[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Você está tentando acessar uma posição do array que não existe.");
			}finally {
				System.out.println("Continua o processo...");
			}
		}
	}
}

/*
numeros[0] -> i = 0; 0 + 3 * 2 -> 6
numeros[1] -> i = 1; 1 + 3 * 2 -> 7
numeros[2] -> i = 2; 2 + 3 * 2 -> 8
numeros[3] -> i = 3; 3 + 3 * 2 -> 9
numeros[4] -> i = 4; 4 + 3 * 2 -> 10
*/