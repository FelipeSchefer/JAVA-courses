package aps;

import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroBoleto {
	List<Boleto> lista;
	
	public CadastroBoleto(List<Boleto> lista) {
		super();
		this.lista = lista;
	}

	public void cadastrar() {
		Boleto boleto = new Boleto();
		int codigoBoleto = 0;
		String nomeCliente = "";
		String emailCliente = "";
		double valorBoleto = 0d;
		
		boolean sair = true;
		String entrarOuSai = "";
		try {
			do {
		
				JOptionPane.showMessageDialog(null, "Complete os Campos do boleto a seguir");
				codigoBoleto  = Integer.parseInt(JOptionPane.showInputDialog("Código do título do boleto"));
				nomeCliente   = JOptionPane.showInputDialog("Nome do Cliente");
				emailCliente  = JOptionPane.showInputDialog("Email do Cliente");
				valorBoleto   = Double.parseDouble(JOptionPane.showInputDialog("Valor do Boleto"));
				JOptionPane.showMessageDialog(null, "Boleto enviado com sucesso");
		
				boleto.setCodigoTituloBoleto(codigoBoleto);
				boleto.setNomeCliente(nomeCliente);
				boleto.setEmailCliente(emailCliente);
				boleto.setValorBoleto(valorBoleto);
		
				lista.add(boleto);

				while(true) {
					entrarOuSai = JOptionPane.showInputDialog("Precione 1 para cadastrar mais um boleto ou 0 para sair");
					
					if(entrarOuSai.equals("1")) {
						sair = true;
						break;
					}
					else if(entrarOuSai.equals("0")) {
						sair = false;
						break;
					}
					else {
						JOptionPane.showMessageDialog(null, "Voce deve inserir escolher 1 ou 2.");
						break;
					}
				}
				
			}while(sair != false);
		
		}
		catch(InputMismatchException exception) {
			System.out.println(exception);
		}
	}
}
