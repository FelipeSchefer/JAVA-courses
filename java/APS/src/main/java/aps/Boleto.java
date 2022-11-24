package aps;

public class Boleto extends Thread{
	private int	codigoTituloBoleto = 0;
	private String	nomeCliente = "";
	private String	emailCliente = "";
	private Double 	valorBoleto = 0d;
	private boolean	boletoEnviado = false;
	
	public Boleto() {}
	
	public Boleto(int codigoTituloBoleto, String nomeCliente, String emailCliente, 
				  Double valorBoleto, boolean boletoEnviado) {
		super();
		this.codigoTituloBoleto = codigoTituloBoleto;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.valorBoleto = valorBoleto;
		this.boletoEnviado = boletoEnviado;
	}
	
	
	public int getCodigoTituloBoleto() {
		return codigoTituloBoleto;
	}
	public void setCodigoTituloBoleto(int codigoTituloBoleto) {
		this.codigoTituloBoleto = codigoTituloBoleto;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	public Double getValorBoleto() {
		return valorBoleto;
	}
	public void setValorBoleto(Double valorBoleto) {
		this.valorBoleto = valorBoleto;
	}
	
	public boolean isBoletoEnviado() {
		return boletoEnviado;
	}
	public void setBoletoEnviado(boolean boletoEnviado) {
		this.boletoEnviado = boletoEnviado;
	}
}

