package aula12;

import java.util.List;

public class ContaQuizeSegundos extends Thread{
	private final long QUINZE_SEGUNDOS = 15000;
	List<Produto> produtoLista;
	ListaProduto verificaListaProduto;
	public ContaQuizeSegundos(List<Produto> produtoLista) {
		super();
		this.produtoLista = produtoLista;
	}
	
	public void run() {
			imprimirQuinzeSegundos();
	}

	public void imprimirQuinzeSegundos() {
		int i = 0;
		try {
			while(true) {
				System.out.println("Quinzenal: " + i++);
				
				verificaListaProduto.listarProdutos(produtoLista);
				
				
				Thread.sleep(QUINZE_SEGUNDOS);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}	
	}

}
