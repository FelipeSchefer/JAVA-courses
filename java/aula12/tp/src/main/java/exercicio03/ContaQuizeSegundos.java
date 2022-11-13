package exercicio03;

import java.util.List;

public class ContaQuizeSegundos extends Thread{
	private final long QUINZE_SEGUNDOS = 15000;
	List<Produto> produtoLista;
	
	public ContaQuizeSegundos(List<Produto> produtoLista) {
		this.produtoLista = produtoLista;
	}
	
	public void run() {
		setName("Verifica produto lista a cada 15 segundos");
		cronometrarQuizeSegundos();
	}
	
	public void cronometrarQuizeSegundos() {
		try {
			while(true) { 
				ListaProduto lista = new ListaProduto();
				
				System.out.println("\nTamanho da lista " + this.produtoLista.size());
				lista.listarProdutos(produtoLista);
				
				Thread.sleep(QUINZE_SEGUNDOS);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
