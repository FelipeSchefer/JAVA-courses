package recursos;

public class LeiDemeter {

	
	public void errado() {
		FolhaPagamento folhaPagamento = new FolhaPagamento();
		String nomeFuncionario = folhaPagamento.getFuncionario().getNome(); // errado
	}
	
	public void correto() {
		FolhaPagamento folhaPagamento = new FolhaPagamento();
		Funcionario funcionario = folhaPagamento.getFuncionario();		
		String nomeFuncionario = funcionario.getNome(); // correto.
		
		fazAlgumaCoisa(); // correto
	}
	
	public void fazAlgumaCoisa() {		
	}
	
}
