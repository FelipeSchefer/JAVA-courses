package aula4;

public class UsuarioServico {

	BancoDadosUsuario bancoDadosUsuario = new BancoDadosUsuario();
	ValidacaoUsuario validacaoUsuario = new ValidacaoUsuario();
	CalculadoraPagamento calculadoraPagamento = new CalculadoraPagamento();
	
	public void salvar(Usuario usuario) {
		validacaoUsuario.validar(usuario);
		calculadoraPagamento.calcular(usuario.pagamento, usuario.salario);
		bancoDadosUsuario.salvar(usuario);
		System.out.println("salvo usuario com sucesso");
	}
	
}
