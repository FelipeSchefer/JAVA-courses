package aula12;

public class MonitoraProduto extends Thread{
	private int tempo = 0;
	private final long QUINZE_SEGUNDOS = 15000;

	
	public MonitoraProduto(int tempo) {
		super();
		this.tempo = tempo;
	}
	
	public void run() {
		if(this.getTempo() == 15)
			imprimirQuinzeSegundos();
	}

	public void imprimirQuinzeSegundos() {
		int i = 0;
		try {
			while(true) {
				System.out.println("Quinzenal: " + i++);
				Thread.sleep(QUINZE_SEGUNDOS);
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
