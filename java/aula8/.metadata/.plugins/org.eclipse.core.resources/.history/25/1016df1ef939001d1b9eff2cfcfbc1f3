package aula4;

public class MainAula4 {

	public static void main(String[] args) {

		CalculadoraPagamento calculadoraPagamento =
					new CalculadoraPagamento();
		
		PagamentoProgramador pagamentoProgramador = 
						new PagamentoProgramador();
		
		float salario = calculadoraPagamento.
						calcular(pagamentoProgramador, 1000f);
		
		System.out.println("salario programador R$ " + salario);
		
		
		PagamentoAnalista pagamentoAnalista = new PagamentoAnalista();
		salario = calculadoraPagamento.
				calcular(pagamentoAnalista, 500f);
		System.out.println("salario analista R$ " + salario);
		
		PagamentoTestador pagamentoTestador = new PagamentoTestador();
		salario = calculadoraPagamento.calcular(pagamentoTestador,
						1500f);
		
		System.out.println("salario testador R$ " + salario);
		
		
		// correcao exercicios
		Usuario usuario = new Usuario();
		usuario.nome = "pedro";
		usuario.salario = 500f;
		usuario.tipo = "programador";
		usuario.pagamento = new PagamentoProgramador();
		
		UsuarioServico usuarioServico = new UsuarioServico();
		usuarioServico.salvar(usuario);
				

	}

}
