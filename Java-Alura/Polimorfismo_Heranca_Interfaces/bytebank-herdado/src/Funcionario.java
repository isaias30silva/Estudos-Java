
//tornamos uma classe abstrata quando ela é a abstraçao mais generica para a criaçao de outras classes
//uma classe abstrata nao pode ser usada para criar um objeto, assim, nao seria possivel dar new Funcionario
//ou seja, usamos o abstract nesse caso para dizer "nao quero criar objetos do tipo "funcionario".
//quero que a classe funcionario seja usada como modelo para criação de outras classes, e essas sim, serao usadas na criacao e objetos
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	//método que estabelece uma bonificação de 10% ao funcionario, 
	//baseado no valor do seu salário
	
	//metodos abstract não tem corpo
	//metodo abstrato define apenas a assinatura(visibilidade, retorno, nome do método e parametros)
	//não há implementacao do metodo nesse momento, mas nas classes filhas
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
