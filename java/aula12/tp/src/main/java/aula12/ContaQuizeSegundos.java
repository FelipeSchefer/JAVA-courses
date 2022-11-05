package aula12;

import java.util.List;

public class ContaQuizeSegundos extends Thread{
	private final long QUINZE_SEGUNDOS = 5000;
	List<Produto> produtoLista;
	ListaProduto verificaListaProduto = new ListaProduto();

	public void ContaQuizeSegundos() {}

	public ContaQuizeSegundos(List<Produto> produtoLista) {
		super();
		this.produtoLista = produtoLista;
	}



	public void run() {
		cronometrarQuizeSegundos();
	}
	
	public void cronometrarQuizeSegundos() {
		while(true) {
			try {
				monitoraProduto();
				Thread.sleep(QUINZE_SEGUNDOS);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void monitoraProduto() {
		int i = 0;
		int tamanhoLista = 0;
		tamanhoLista = verificaListaProduto.medirTamanhoLista(produtoLista);
		int tamanhoListaAnterior = tamanhoLista;
		int tamanhoListaAtual= tamanhoLista;

		while(true) {
			System.out.println("Quinzenal: " + i++);
			
			if(i % 2 == 0) {
				tamanhoListaAnterior = verificaListaProduto.medirTamanhoLista(produtoLista);
			}
			else {
				tamanhoListaAtual = verificaListaProduto.medirTamanhoLista(produtoLista);					
			}
			
			if(tamanhoLista == 0)
				System.out.println("Não há novos intens na Lista de Produtos");
			
			if(tamanhoListaAnterior == tamanhoListaAtual) {
				System.out.println("Tamanho da lista continua com mesma\n"
						         + "quantidade de itens: " + tamanhoListaAtual);
				
				verificaListaProduto.listarProdutos(produtoLista);					
			}
			else {
				System.out.println("Tamanho da lista mudou a\n"
			  			         + "quantidade de itens: " + tamanhoListaAtual);
				
				verificaListaProduto.listarProdutos(produtoLista);			
			}
			break;
		}
	}
}
