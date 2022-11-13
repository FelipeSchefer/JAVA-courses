package exercicio04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner escreva = new Scanner(System.in); 
		
		String opcao = ""; 
		boolean sair = false;
		while(sair == false) {
			
			opcao =  JOptionPane.showInputDialog(
					"\n----------------- MENU -----------------" +
					"\n1. Enviar email " +
					"\n2. Enviar mensagem (torpedo) " +
					"\n3. Enviar whats " +
					"\n Escolha uma das opções acima 1, 2 ou 3");

			
			if("1".equals(opcao)) {
				Email email = new Email();
				email.start();		
				System.out.println("Aguardando Thread Email");
			}
			else if("2".equals(opcao)) {
				Torpedo torpedo = new Torpedo();
				System.out.println("Aguardando Thread Torpedo");
				torpedo.start();	
			}
			else if("3".equals(opcao)) {
				String MINHA_MENSAGEM = "";
				MINHA_MENSAGEM = JOptionPane.showInputDialog("Escreva sua mensagem aqui");
				Whats whats = new Whats(MINHA_MENSAGEM);
				System.out.println("Aguardando Thread Whats");
				whats.start();				
			}
			else if(opcao == null) {
				sair = true;
			}
			else {
				JOptionPane.showInputDialog("Não foi escolhido uma opção valida por favor\n"
						+ "escolha um destes numeros 1, 2 ou 3");				
			}
			System.out.println("-----------------------------");
		}
	}
}
