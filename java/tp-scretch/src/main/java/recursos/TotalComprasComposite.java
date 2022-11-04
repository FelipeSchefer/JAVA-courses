package recursos;

import java.util.ArrayList;
import java.util.List;

public class TotalComprasComposite {

	List<TotalCompras> listaTotalCompras = new ArrayList<TotalCompras>();
	
	public void adicionarTotalCompras(TotalCompras totalCompras) {
		this.listaTotalCompras.add(totalCompras);
	}
	
	public int retornaTotalComprasDia() {
		int totalComprasDia = 0;
		for(TotalCompras totalCompras : listaTotalCompras) {
			totalComprasDia += totalCompras.totalCompras();
		}
		return totalComprasDia;
	}
	
}
