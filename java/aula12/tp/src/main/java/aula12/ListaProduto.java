package aula12;

import java.util.List;

public class ListaProduto {
	
	public ListaProduto() {}
	
	public void listarProdutos(List<Produto> produtoLista) {
		System.out.println("---------- LISTA DE PRODUTOS ----------");
		
		for(Produto produto : produtoLista) {
			System.out.println(" itens: produto " + produto.getNome() + 
							   " preco " + produto.getPreco() );
		}
		System.out.println("----------------------------------------");
	}
}
