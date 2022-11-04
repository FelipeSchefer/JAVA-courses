package aula2;

public class Main2 {

		
	public static void main(String[] args) {
 
		CalculadoraPagamentoParametros  parametros = new CalculadoraPagamentoParametros();
		parametros.dataNascimento = "26/06/79";
		parametros.idade = 30;
		parametros.nome = "pedro";
		parametros.salario = 150f;
		
		CalculadoraPagamento calculadoraPagamento =
				new CalculadoraPagamento(parametros);
		
		float resultado = calculadoraPagamento.retornaCalculoFuncionario();
		System.out.println(resultado);
		
		
		int serie = 0;
		
		//boolean eSeriePrimaria = serie >= 1 && serie <= 9;  
		
		if(eSEriePrimaria(serie)) {
			System.out.println("PRIMARIO");
		}

	}
	
	public static boolean eSEriePrimaria(int serie) {
		return serie >= 1 && serie <= 9;
	}
	
	
	public double somarComVirgula(double valor1,double valor2) {
		return -1;
	}
	
	public double somarSemVirgula(double valor1,double valor2) {
	return -1;
	}
			
	
	public int buscarChave(String id) throws Exception{
		boolean eIdInvalido = id == null || id.equals("");
		
		if(eIdInvalido) {
			throw new Exception("Id invalido");
		}
		
		// processamento da busca da chave
		return 1;
	}
	
	

}
