package exercicio04;

public class Torpedo extends Thread{
	private final long TRES_SEGUNDOS = 3000;

	public Torpedo() {
		
	}
	
	public void run() {
		setName("Envio de torpedo a cada 3s");
		cronometrar();
	}
	
	public void cronometrar() {
		try {
			while(true) { 
				for(int i = 0; i <=5 ; i++)
					System.out.println("Enviando mensagem");
				
				Thread.sleep(TRES_SEGUNDOS);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
