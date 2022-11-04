package aula8b;

public class Internet implements TotalCompras {

	private int total = 0;
	
	public void realizandoCompras(int valor) {
		total += valor;
	}
	
	@Override
	public int totalCompras() {
		return total;
	}

}
