package br.com.geekuniversity.secao13;
//Template Method

/*
- O padrão Template Method define o esqueleto de um algoritmo dentro de um método,
transferindo alguns de seus passos para as subclasses. O Template Method permite
que as subclasses redefinam certos passos de um algortimo sem alterar a estrutura
do próprio algoritmo.

Algoritmos são "receitas" passo-a-passo para resolver algum problema.

receber numero;
retornar numero * numero;


metodo_principal(){
   passo1();
   passo2();
   passo3();
}

*/
public class Programa32 {

	public static void main(String[] args) {
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		
		tit.treinoDiario();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		
		tft.treinoDiario();

	}

}
