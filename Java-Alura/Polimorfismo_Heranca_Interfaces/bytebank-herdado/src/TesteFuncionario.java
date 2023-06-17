
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		//criando o objeto do tipo Funcionario
		//Funcionario é uma classe abstrata, nao pode ser usada para criar um objeto,
		//mas pode ser usada como referência
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
