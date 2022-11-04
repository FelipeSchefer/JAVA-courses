package aula12;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Produto> produtoLista = new ArrayList<Produto>();
		
		MonitoraProduto monitora = new MonitoraProduto(3);
		monitora.start();			
		
		MonitoraProduto monitora2 = new MonitoraProduto(15);
		monitora2.start();			
		

		CadastraProduto cadProduto = new CadastraProduto(produtoLista);
		cadProduto.cadastrarProduto();
		cadProduto.cadastrarProduto();
		
		

	
		
		
		
		
		
		
		
		
//		List<Produto> produtoLista = new ArrayList<Produto>();
//		
//		monitoraProduto monitora = new monitoraProduto();
//		monitora.start();		
//		
//		
//		CadastraProduto cadProduto = new CadastraProduto(produtoLista, "cadastra");
//		
//		ConsoleDados ex = new ConsoleDados(produtoLista, "cadastra");		
//		ex.start();
//		
//
//		ConsoleDados ex2 = new ConsoleDados(produtoLista,  "cadastra");
//		ex2.start();
//		
//		
		
		
	}
}
