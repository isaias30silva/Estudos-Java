package br.com.alura.main;

public class Teste {

	public static void main(String[] args) {

		//nao é possivel instanciar uma enumeracao
		//usamos o nome da enumeracao, seguido do ponto para selecionar
		//um de seus valores definidos
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name());
		System.out.println(pMin.ordinal());
		
		System.out.println(pMax.name());
		System.out.println(pMax.ordinal());
		
		//obtendo os valores definidos para os objetos do Enum
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());
	}

}
