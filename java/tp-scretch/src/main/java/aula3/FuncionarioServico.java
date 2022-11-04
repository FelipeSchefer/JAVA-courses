package aula3;

public class FuncionarioServico {

	Funcionario funcionario;
	
	public int editarFuncionario(Funcionario funcionario) {
		int retorno=0;
		try {
			validarFuncionario(funcionario);
			retorno = processarEditarFuncionario(funcionario);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return retorno;
	}

	public int processarEditarFuncionario(Funcionario funcionario) throws Exception {

		boolean isError = true;
		if(isError) {
			throw new Exception("error no processar editar funcionario");
		}
		
		return 1; // processamento
	}

	private void validarFuncionario(Funcionario funcionario) throws Exception {
		boolean isIdInvalido = funcionario.id == 0;
		if (isIdInvalido) {
			throw new Exception("Funcionario deve ter um ID");
		}
	}
}
