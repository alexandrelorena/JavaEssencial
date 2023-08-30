package projetoBanco;

public class Teste {

	public static void main(String[] args) {

		Cliente felicity = new Cliente("Felicity Jones", "felicity@gmail.com", "123.456.789.01",
				Utils.stringParaData("17/05/1981"));
		Cliente angelina = new Cliente("Angelina Jolie", "angelina@gmail.com", "234.567.890.12",
				Utils.stringParaData("23/02/1978"));

//		System.out.println(felicity);
//		System.out.println();
//		System.out.println(angelina);

		Conta c101 = new Conta(felicity);
		Conta c102 = new Conta(angelina);

		// Depositando um valor positivo
		c101.depositar(500.00);
		c102.depositar(500.00);

		// Depositando valor 0
//		c101.depositar(0.0);
//		c102.depositar(0.0);

		// Depositando valor negativo
//		c101.depositar(-100.00);
//		c102.depositar(-100.00);

		// Tentando sacar valor no saldo suficiente
//		c101.sacar(300.00);

		// Tentando sacar valor 0
//		c101.sacar(0.00);

		// Tentando sacar valor negativo
//		c101.sacar(-100.00);

		// Setando um limite para c101
		c101.setLimite(500.00);

		// Tentando sacar valor maior que o saldo
		c101.sacar(600.00);
		
		// Tentando sacar valor maior que o saldo
		c101.transferir(c102, 100.00);

		System.out.println(c101);
		System.out.println();
		System.out.println(c102);
		System.out.println();

		
	}

}