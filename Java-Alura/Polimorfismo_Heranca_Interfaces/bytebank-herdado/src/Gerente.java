//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Gerente extends Funcionario {
	
	private int senha;
	
	//método que verifica se a senha do gerente está correta, 
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	

	public void setSenha(int senha) {
		this.senha = senha;
	}
	

}
