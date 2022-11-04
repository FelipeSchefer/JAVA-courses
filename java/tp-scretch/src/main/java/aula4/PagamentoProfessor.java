package aula4;

public class PagamentoProfessor implements Pagamento {

	@Override
	public float calcular(float salario) {
		return salario + (salario * 0.5f);
	}

}
