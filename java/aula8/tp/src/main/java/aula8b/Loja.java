package aula8b;

public class Loja implements TotalCompras {

	private int total = 0;
	
	public void comprar(int valor) {
		total += valor;
	}
	
	@Override
	public int totalCompras() {
		return total;
	}

}
