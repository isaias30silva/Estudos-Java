
//interface é uma classe abstrata com todos os metodos abstratos
//ou seja, os metodos possuem apenas assinatura
//a interface nao possui nada concreto, nem atributos, nem metodos 
//interface define um contrato: as classes que a implementam devem implementar seus metodos
public interface Autenticavel {
	
	public void setSenha(int senha);
	
	public boolean autentica(int senha);
}
