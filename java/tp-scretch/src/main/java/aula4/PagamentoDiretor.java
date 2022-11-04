package aula4;

public class PagamentoDiretor implements Pagamento {

	@Override
	public float calcular(float salario) {
		return salario + (salario * 0.7f);
	}

}
