
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		//Polimorfismo: na instanciacao do objeto:
		//do lado direito, inserimos o tipo mais generico (Funcionario)
		//do lado esquerdo, inserimos o tipo mais especifico (Gerente)
		//Funcionario g1 = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);

		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(ev);
		controle.registro(d);
		
		System.out.println(controle.getSoma());
	}

}
