package aula12;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Produto> produtoLista = new ArrayList<Produto>();
		
		
//		ConsoleDados contaTresSegundos = new ConsoleDados(3);
//		contaTresSegundos.start();			
//		
//		ConsoleDados novamenteContaTresSegundos = new ConsoleDados(3);
//		novamenteContaTresSegundos.start();			
//		
//		MonitoraProduto contaQuizeSegundos = new MonitoraProduto(15);
//		contaQuizeSegundos.start();			
		
		CadastraProduto cadProduto = new CadastraProduto(produtoLista);
		cadProduto.cadastrarProduto();
//		cadProduto.cadastrarProduto();
		
		cadProduto.removerProduto("caneta");
		

	
		
		
		
		
		
		
		
		
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
