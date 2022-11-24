package aps;

import java.util.List;

public class EnviarEmailBoleto extends Thread{
	List<Boleto> lista;
	private final int TRINTA_SEGUNDOS = 30000;
	
	public EnviarEmailBoleto(List<Boleto> lista) {
		super();
		this.lista = lista;
	}

	public void run() {
		int i = 0;
		try {			
			while(true) {
				System.out.println("TEMPO: " + i++);
				Thread.sleep(TRINTA_SEGUNDOS);
				for(Boleto boleto : lista) {
					System.out.println("\n Codigo " + boleto.getCodigoTituloBoleto() +
							"\n Nome " + boleto.getNomeCliente() + 
							"\n Email " + boleto.getEmailCliente() + 
							"\n Valor " + boleto.getValorBoleto() + 
							"\n Status " + boleto.isBoletoEnviado());
				}
				
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
