package br.com.alura.main;

//aqui, Prioridade será uma classe e MIN, NORMAL e MAX seus objetos
//esses objetos serao criados automaticamente
public enum Prioridade {
	
	//a ordem dos objetos é definida automaticamente
	//min=0, normal=1, max=2 (indices)
	//mas se decidir definir os valores de cada objeto
	//será preciso fazer isso por meio de construtores
	MIN(1),NORMAL(5),MAX(10);

	private int valor;
	
	//Construtor para definir o valor dos objetos
	Prioridade(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

}
