package aula1;

public class ContaCorrente implements Conta {

	@Override
	public void depositar() {
		System.out.println("depositando na conta corrente");
		
	}

	@Override
	public void sacar() {
		System.out.println("sacando na conta corrente");		
	}

}
