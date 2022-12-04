package models;

/* 4
 * 
 * Liskov Substitution Principle 
 */
public class CalculaSalarioProfFrances extends CalculaSalario{

	public CalculaSalarioProfFrances(String profissao, Double valorHora, Integer horas) {
		super(profissao, valorHora, horas);
	}

	public String somar() {
		
		super.soma = valorHora * horas;
		
		return "Profissão: " + profissao + " Salario de: " + super.soma ;
	}

}
