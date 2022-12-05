package models;

/* 4
 * 
 * Liskov Substitution Principle 
 */
public abstract class CalculaSalario {
	
    public Double soma = 0d;
	public String profissao = "";
	public Double valorHora = 0d; 
	public Integer horas = 0;

	public CalculaSalario(String profissao, Double valorHora, Integer horas) {
		super();
		this.profissao = profissao;
		this.valorHora = valorHora;
		this.horas = horas;
	}

	public abstract String somar();
}
