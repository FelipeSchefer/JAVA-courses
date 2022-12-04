package models;

/* 4
 * 
 * Liskov Substitution Principle 
 */
public class CalculaSalarioRecrutador extends CalculaSalario{

	public CalculaSalarioRecrutador(String profissao, Double valorHora, Integer horas) {
		super(profissao, valorHora, horas);
	}

	public String somar() {
		
		super.soma = valorHora * horas;
		
		return "Profissão: " + profissao + " Salario de: " + super.soma ;
	}
}
