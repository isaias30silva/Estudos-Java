
//a classe Cliente implementa a interface Autenticavel, e por isso, é obrigada a implementar seus métodos
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
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
