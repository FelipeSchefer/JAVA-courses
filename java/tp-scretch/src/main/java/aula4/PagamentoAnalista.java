package aula4;

public class PagamentoAnalista implements Pagamento {

	private float ACRESCIMO_SALARIO_ANALISTA = 100f;
	
	@Override
	public float calcular(float salario) {
		return salario + ACRESCIMO_SALARIO_ANALISTA;
	}

}
