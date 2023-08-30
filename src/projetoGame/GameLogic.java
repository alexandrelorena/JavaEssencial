package projetoGame;
import java.util.Random;

public class GameLogic {
    private int pontos;
    private int valor1;
    private int valor2;
    private int operacao;

    private Random random;

    public GameLogic() {
        pontos = 0;
        random = new Random();
    }

    public void gerarNovaOperacao() {
        valor1 = random.nextInt(10); // Números aleatórios de 0 a 9
        valor2 = random.nextInt(10);
        operacao = random.nextInt(3); // 0 para soma, 1 para subtração, 2 para multiplicação
    }

    public String getOperacaoTexto() {
        if (operacao == 0) {
            return valor1 + " + " + valor2;
        } else if (operacao == 1) {
            return valor1 + " - " + valor2;
        } else {
            return valor1 + " * " + valor2;
        }
    }

    public boolean verificarResposta(int resposta) {
        int resultado;
        if (operacao == 0) {
            resultado = valor1 + valor2;
        } else if (operacao == 1) {
            resultado = valor1 - valor2;
        } else {
            resultado = valor1 * valor2;
        }
        return resposta == resultado;
    }

    public void incrementarPontos() {
        pontos++;
    }

    public int getPontos() {
        return pontos;
    }
}
