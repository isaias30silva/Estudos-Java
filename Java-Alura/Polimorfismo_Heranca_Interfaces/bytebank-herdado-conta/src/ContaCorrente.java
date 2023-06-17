//em situação de herança, a subclasse herda os atributos e métodos, mas nao herda os construtores
//no caso, se a classe mae tiver um construtor específico
//entao, as classes filhas precisam inserir seus próprios construtores
public class ContaCorrente extends Conta implements Tributavel{

	//a superclasse nao tem um construtor padrao, entao, será usado o construtor criado na superclasse
	//passando seus parametros e o super
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	//sobrescrita do metodo saca, que deve ter a mesma assinatura do método da superClasse
	//a anotação @Override informa ao compilador que ele precisa verificar as regras de sobrescrita
	//na sobrescria, por tanto, a mudança deve ser no campo do método
	@Override
	public boolean saca(double valor) {
		//aqui vai a regra especifica para esse metodo saca, que será o valor do saque + 0.20 centavos
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
