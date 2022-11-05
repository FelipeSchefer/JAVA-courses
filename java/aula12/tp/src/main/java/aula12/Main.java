package aula12;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Produto> produtoLista = new ArrayList<Produto>();
		produtoLista.add(new Produto("borracha", 1.10d));
		produtoLista.add(new Produto("caneta", 2.20d));
		produtoLista.add(new Produto("copo", 3.30d));
		
//		ContaTresSegundos contaTresSegundos = new ContaTresSegundos();
//		contaTresSegundos.start();			
		
//		ContaTresSegundos novamenteContaTresSegundos = new ContaTresSegundos();
//		novamenteContaTresSegundos.start();			
		
		
		CadastraProduto cadProduto = new CadastraProduto(produtoLista);
		cadProduto.cadastrarProduto();
		
//		ListaProduto listaProduto = new ListaProduto();
//		listaProduto.listarProdutos(produtoLista);

		ContaQuizeSegundos contaQuizeSegundos = new ContaQuizeSegundos(produtoLista);
		contaQuizeSegundos.run();

		
		cadProduto.removerProduto("caneta");
		
//		contaQuizeSegundos.monitoraProduto();
		
//		listaProduto.listarProdutos(produtoLista);

//		ContaQuizeSegundos contaQuizeSegundos = new ContaQuizeSegundos(produtoLista);
//		contaQuizeSegundos.monitoraProduto();

	}
}
