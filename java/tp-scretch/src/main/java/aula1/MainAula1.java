package aula1;

public class MainAula1 {

	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa();
		p1.nome = "marcelo";
		p1.idade = 40;
		
		
		Endereco end1 = new Endereco();		
		end1.nomeRua = "asssi brasil";
		p1.endereco = end1;
		
		Pessoa p2 = new Pessoa();
		p2.nome = "pedro";
		p2.idade = 15;
		p2.endereco = end1;
		
		Professor prof1 = new Professor();		
		Aluno aluno1 = new Aluno();
		
		ContaPoupanca cp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();
		ContaPix contaPix = new ContaPix();
		
		chamarDepositar(cc);
		chamarDepositar(cp);
		chamarDepositar(contaPix);
		
		Impressora imp[] = new Impressora[3];
		
	
		
		
		
	}
	
	public static void chamarDepositar(Conta cp) {
		cp.depositar();
	}
	
	

}
