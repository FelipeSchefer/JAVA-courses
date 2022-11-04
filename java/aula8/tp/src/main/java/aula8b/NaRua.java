package aula8b;

public class NaRua implements TotalCompras {

	private int total;
	
	public void realizarCompra(int valor) {
		total = total + valor;
	}
	
	@Override
	public int totalCompras() {
		return total;
	}

}
