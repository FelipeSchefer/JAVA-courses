package exercicio03;

import java.util.List;

public class ContaQuizeSegundos extends Thread{
	private final long QUINZE_SEGUNDOS = 5000;
//	List<Produto> produtoLista;
//	ListaProduto verificaListaProduto = new ListaProduto();

	public void run() {
		cronometrarQuizeSegundos();
	}
	
	public void cronometrarQuizeSegundos() {
//		int tamanhoLista = 0;
		try {
			while(true) { 
				System.out.println("ta");
//			System.out.println("Tamanho da lista " + this.produtoLista.size());
//			tamanhoLista = verificaListaProduto.medirTamanhoLista(produtoLista);
			Thread.sleep(QUINZE_SEGUNDOS);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
