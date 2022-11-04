package notaFiscal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NotaModel {
	private int tipoNota;
	private int numeroNota;
	private double valor;
	private double valorTotal;
	private String observacao;
	private String item;
	private String descricao;
	private HashMap<String, Double> itens = new HashMap<String, Double>();
	private List<Double> valorList = new ArrayList<Double>();
	
	
	public String getQuantidadeDeTipos() {
		return " 1 ou 2 ";
	}
	
	public List<Double> getValorTotal() {
		return valorList;
	}
	public double somarValorTotal() {	
		for (Double value : valorList){
			this.valorTotal += value;
		}
		return this.valorTotal;
	}
	
	public HashMap<String, Double> getItens(){
		return this.itens;
	}
	public void adicionarItem(String item, double valor) {
		this.setItem(item);
		this.setValor(valor);		
	    itens.put(item, valor);
	}		
	
	public int getTipoNota() {
		return tipoNota;
	}
	public void setTipoNota(int tipoNota) {
		this.tipoNota = tipoNota;
	}
	
	public int getNumeroNota() {
		return numeroNota;
	}
	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		valorList.add(valor);	
		this.valor = valor;
	}
	
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
