package br.com.geekuniversity.secao09;


/*
- O nome das classes inicia com letra maiúscula;
- O nome não deve conter: Acentuação, caracteres especiais, espaço
- Nas classes Java, não existe a implementação da função main()
- Toda classe Java possui a seguinte forma:
- O nome da classe Java DEVE ser o mesmo nome do arquivo java.
- Tudo que estiver dentro das "chaves" {} faz parte da classe.

public class NomeDaClasse{

}
*/

//Atributos

/*
 - São as características da classe/molde/modelo de dados;
 - Podemos entender atributos como variáveis da classe;
 - Uma outra forma de nomenclatura para os atributos são estados;
 - Atributos são nomeados em letras minúsculas, sem espaços, sem
 caracteres especiais, sem acentuação.
*/

//Métodos

/*
 - Podemos entender os métodos como a ação que é realizada por um objeto da classe;
 - Podemos entender também que os métodos são comportamentos dos objetos da classe;

 - Mesmos requisitos para funções
     Uma função deve ter o seguinte:
	 a) Tipo de retorno (Tipo de dado que a função vai retornar);
	 b) Nome - Corresponde a ação que a função realiza;
	 c) Parâmetros/Argumentos de entrada (Opcional);
	 d) Retorno (Opcional - depende do tipo de retorno);
*/

public class Produto {
	String nome;
	float preco;
	float desconto;
	
	//Método para aumentar o preço do projeto em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
}
