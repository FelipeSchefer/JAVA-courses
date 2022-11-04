package aula2;

import aula2.Funcionario;

public class CalculadoraPagamento {

	private static final float ACRESCIMENTO_SALARIO_SENIOR = 0.2f;
	float resultadoFinal = 0;

	public CalculadoraPagamento(CalculadoraPagamentoParametros calculadoraPagamentoParametros) {

		Funcionario funcionario = new Funcionario();
		funcionario.dataNascimento = calculadoraPagamentoParametros.dataNascimento;
		funcionario.idade = calculadoraPagamentoParametros.idade;
		funcionario.nome = calculadoraPagamentoParametros.nome;
		funcionario.salario = calculadoraPagamentoParametros.salario;
		try {

			validaFuncionario(funcionario);
		} catch (Exception i) {
			System.out.println("errro na validação");
		}
		resultadoFinal = calcular(funcionario);
	}

	void validaFuncionario(Funcionario funcionario) throws Exception {
		if (estaInvalidoParametrosFuncionarios(funcionario)) {
			throw new Exception("error funcionario");
		}
	}

	private boolean estaInvalidoParametrosFuncionarios(Funcionario funcionario) {
		return funcionario.nome.equals("") || funcionario.idade == 0;
	}

	public float retornaCalculoFuncionario() {
		return resultadoFinal;
	}

	private float calcular(Funcionario funcionario) {

		float resultado = 0;
		float ACRESCIMENTO_SALARIO_JUNIOR = 0.1f;

		if (salarioJunior(funcionario)) {
			resultado = processarCalculoFuncionario(funcionario.salario, ACRESCIMENTO_SALARIO_JUNIOR);
		}
		if (salarioSenior(funcionario)) {
			resultado = processarCalculoFuncionario(funcionario.salario, ACRESCIMENTO_SALARIO_SENIOR);
		}

		return resultado;
	}

	private float processarCalculoFuncionario(float salario, float acrescimo) {
		return (salario * acrescimo) + salario;
	}

	private boolean salarioSenior(Funcionario funcionario) {
		return funcionario.salario > 1000;
	}

	private boolean salarioJunior(Funcionario funcioanario) {
		return funcioanario.salario < 1000;
	}

}
