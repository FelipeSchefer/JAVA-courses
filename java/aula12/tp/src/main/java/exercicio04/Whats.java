package exercicio04;

public class Whats extends Thread{
	private final long UM_SEGUNDOS = 1000;
	private String MINHA_MENSAGEM = "";
	
	public Whats(String MINHA_MENSAGEM ) {
		this.MINHA_MENSAGEM = MINHA_MENSAGEM;
	}
	
	public void run() {
		setName("Envio de email a cada 1s");
		cronometrar();
	}
	
	public void cronometrar() {
		try {
			while(true) { 
				for(int i = 0; i <=10 ; i++)
					System.out.println("Nome da Thead " + getName() +
							"\nEnviando whats " + this.getMINHA_MENSAGEM());
				
				Thread.sleep(UM_SEGUNDOS);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getMINHA_MENSAGEM() {
		return MINHA_MENSAGEM;
	}

	public void setMINHA_MENSAGEM(String mINHA_MENSAGEM) {
		MINHA_MENSAGEM = mINHA_MENSAGEM;
	}
}
