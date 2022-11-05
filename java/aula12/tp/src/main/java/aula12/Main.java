package aula12;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Produto> produtoLista = new ArrayList<Produto>();
			
		ContaTresSegundos contaTresSegundos = new ContaTresSegundos();
		contaTresSegundos.start();			
		
//		ContaTresSegundos novamenteContaTresSegundos = new ContaTresSegundos();
//		novamenteContaTresSegundos.start();			
		
		ContaQuizeSegundos contaQuizeSegundos = new ContaQuizeSegundos(produtoLista);
		contaQuizeSegundos.start();			
		
		CadastraProduto cadProduto = new CadastraProduto(produtoLista);
		cadProduto.cadastrarProduto();
		
		ListaProduto listaProduto = new ListaProduto();
		listaProduto.listarProdutos(produtoLista);
		
		cadProduto.removerProduto("caneta");
		

	
		
		
		
		
		
		
		

		
		
	}
}
