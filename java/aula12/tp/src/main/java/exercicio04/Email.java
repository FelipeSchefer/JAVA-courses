package exercicio04;

public class Email extends Thread{
	private final long UM_SEGUNDOS = 1000;

	public Email() {
		
	}
	
	public void run() {
		setName("Envio de email a cada 1s");
		cronometrarQuizeSegundos();
	}
	
	public void cronometrarQuizeSegundos() {
		try {
			while(true) { 
				for(int i = 0; i <=10 ; i++)
					System.out.println("Enviando email");
				
				Thread.sleep(UM_SEGUNDOS);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
