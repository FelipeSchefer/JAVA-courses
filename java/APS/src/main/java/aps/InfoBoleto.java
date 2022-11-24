package aps;

import java.util.List;

public class InfoBoleto {
	List<Boleto> lista;

	public InfoBoleto(List<Boleto> lista) {
		super();
		this.lista = lista;
	}

	public void listarBoletos() {
		System.out.println("Lista de boletos");
		for(Boleto boleto : lista) {
			System.out.println("\n Codigo " + boleto.getCodigoTituloBoleto() +
					"\n Nome " + boleto.getNomeCliente() + 
					"\n Email " + boleto.getEmailCliente() + 
					"\n Valor " + boleto.getValorBoleto() + 
					"\n Status " + boleto.isBoletoEnviado());
		}
	}
	
}
