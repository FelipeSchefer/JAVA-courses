package exercicio03;

import java.util.List;

public class ContaTresSegundos extends Thread {
	private final int QUINZE_SEGUNDOS = 5000;
	List<Produto> produtoLista;
	ListaProduto verificaListaProduto = new ListaProduto();

	public void run() {
		imprimirTresSegundos();
	}

	public void imprimirTresSegundos() {
		int i = 0;
		try {			
			while(true) {
				System.out.println("Trimestral: " + i++);
				Thread.sleep(QUINZE_SEGUNDOS);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}