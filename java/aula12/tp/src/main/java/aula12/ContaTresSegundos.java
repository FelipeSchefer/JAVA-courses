package aula12;


public class ContaTresSegundos extends Thread {
	private final int TRES_SEGUNDOS = 3000;

	public void run() {
		imprimirTresSegundos();
	}

	public void imprimirTresSegundos() {
		int i = 0;
		try {			
			while(true) {
				System.out.println("Trimestral: " + i++);
				Thread.sleep(TRES_SEGUNDOS);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
