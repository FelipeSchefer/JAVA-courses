package aula7a;

public class GolVeiculo implements Veiculo {

	@Override
	public void andar() {
		System.out.println("Gol andando");
	}

	@Override
	public void parar() {
		System.out.println("Gol parando");
	}

}
