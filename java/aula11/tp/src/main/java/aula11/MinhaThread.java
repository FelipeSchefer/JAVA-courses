package aula11;

import javax.swing.JOptionPane;

public class MinhaThread extends Thread {
	private String tipo ;
	
	public MinhaThread(String tipo) {
		this.tipo = tipo;
	}
	
	public void run() {
		System.out.println(imprimirNumeros(this.tipo));
		nomear();
	}

	
	public String imprimirNumeros(String tipo) {
		for(int i=0; i <= 10; i++)
			System.out.println(" number: " + i + " tipo: " + tipo);
		
		return "end tipo: " + tipo;
	}
	
	public void nomear() {
		String nome = "";
		nome = JOptionPane.showInputDialog("digite seu nome");
		JOptionPane.showMessageDialog(null, "seu nome é:" + nome);
		System.out.println("nome "+ nome);
	}

}
