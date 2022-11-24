package aps;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) throws InterruptedException{
		List<Boleto> listaBoleto = new ArrayList<Boleto>();
		
		Boleto boleto = new Boleto();
		
		boleto.setCodigoTituloBoleto(4654);
		boleto.setName("Pedro");
		boleto.setEmailCliente("pedro@hotmail.com");
		boleto.setValorBoleto(50.6);
		boleto.setBoletoEnviado(true);
		
		listaBoleto.add(boleto);
		
		EnviarEmailBoleto enviarEmailBoleto = new EnviarEmailBoleto(listaBoleto);
		enviarEmailBoleto.start();
		
		String opcao = "";
		boolean sair = false;
		while(sair == false) {
			
			opcao = JOptionPane.showInputDialog("Digite c para cadastrar ou l para listar os Boletos");

			if(opcao.equals("c")) {
				CadastroBoleto cadastroBoleto = new CadastroBoleto(listaBoleto);				
				cadastroBoleto.cadastrar();
			}
			else if(opcao.equals("l")) {
				InfoBoleto infoBoleto = new InfoBoleto(listaBoleto);				
				infoBoleto.listarBoletos();
			}
			

			opcao = JOptionPane.showInputDialog("Se você deseja continuar digite 1 se sair digite 0");
			if(opcao.equals("1")) {
				sair = false;				
			}
			else if(opcao.equals("0")) {
				sair = true;
			}
			else {
				while(!opcao.equals("1") || !opcao.equals("0")) {
					opcao = JOptionPane.showInputDialog("Atenção opção invalida escolha \n 1 para continuar ou 0 para sair");
					if(opcao.equals("1") || opcao.equals("0")){
						break;
					}
				}
			}
			
		}
		
	}

}
