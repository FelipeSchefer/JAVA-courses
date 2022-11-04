package recursos;

public class Main8 {

	public static void main(String[] args) {

		NaRua naRua = new NaRua();
		naRua.realizarCompras(10);
		Loja loja = new Loja();
		loja.comprar(15);
		Internet internet = new Internet();
		internet.realizandoCompras(20);
		
		TotalComprasComposite totalComprasComposite =new TotalComprasComposite();
		totalComprasComposite.adicionarTotalCompras(internet);
		totalComprasComposite.adicionarTotalCompras(loja);
		totalComprasComposite.adicionarTotalCompras(naRua);
		
		int totalDia = totalComprasComposite.retornaTotalComprasDia();
		System.out.println("Total Compras dia R$ " + totalDia);
		
		
		
		
		
	}

}
