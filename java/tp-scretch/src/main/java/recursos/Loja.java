package recursos;

public class Loja implements TotalCompras {

	
	int totalCompras = 0;
	
	public void comprar(int totalCompras) {
		this.totalCompras += totalCompras;
	}
	
	@Override
	public int totalCompras() {		
		return totalCompras;
	}

}
