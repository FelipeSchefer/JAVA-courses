package trabalho;

public class Televisao extends ValidacaoTelevisao {
	
	String nome; 
	int tamanho; 
	
	public Televisao(String nomeTV, int tamanhoTV) {		
		validar(nomeTV, tamanhoTV);
		
		nome = nomeTV;
		tamanho = tamanhoTV;
	}	
}
