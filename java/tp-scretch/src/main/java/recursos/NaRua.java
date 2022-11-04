package recursos;

public class NaRua implements TotalCompras {

	int totalCompras = 0;
	
	public void realizarCompras(int totalCompras) {
		this.totalCompras += totalCompras;
	}
	
	@Override
	public int totalCompras() {
		return totalCompras;
	}

}
