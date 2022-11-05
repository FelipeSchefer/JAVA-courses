package aula12;


public class ConsoleDados extends Thread {
	private int tempo = 0;
	private final int TRES_SEGUNDOS = 3000;

	public ConsoleDados(int tempo) {
		super();
		this.tempo = tempo;		
	}
	
	public void run() {
		if(this.getTempo() == 3)
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

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
