//Administrador é um Funcionario, Administrador herda da class Funcionario
//Administrador implementa a interface Autenticavel, e portanto, deve implementar seus métodos
public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
