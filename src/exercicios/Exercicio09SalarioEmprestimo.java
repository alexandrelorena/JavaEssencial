package exercicios;

public class Exercicio09SalarioEmprestimo {

	public static void main(String[] args) {
		int salario = 1000;
		int prestacao = 200;

		if (prestacao > 0.20 * salario) {
			System.out.println("Empréstimo não concedido!");
		} else {
			System.out.println("Parabéns, emprestimo concedido com sucesso!");
		}

	}
}
