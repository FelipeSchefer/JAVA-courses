package aula8b;

public class Main {

	public static void main(String[] args) {
		NaRua naRua = new NaRua();
		naRua.realizarCompra(10);
		
		Internet internet = new Internet();
		internet.realizandoCompras(15);
		
		Loja loja = new Loja();
		loja.comprar(20);
		
		TotalComprasComposite totalComprasComposite = new TotalComprasComposite();
		totalComprasComposite.adicionarTotalCompras(naRua);
		totalComprasComposite.adicionarTotalCompras(internet);
		totalComprasComposite.adicionarTotalCompras(loja);
		
		int totalDia = totalComprasComposite.retornarTotalComprasDia();
		System.out.println("Total de Compras do Dia " + totalDia);
	}

}
