package models;

/* 4
 * 
 * Liskov Substitution Principle 
 */
public class CalculaSalarioRH extends CalculaSalario{

	double BONUS = 1.2d;
	
	public CalculaSalarioRH(String profissao, Double valorHora, Integer horas) {
		super(profissao, valorHora, horas);
	}

	public String somar() {
		
		super.soma = (valorHora * horas) * BONUS;
		
		return " Profissão: " + profissao + " Salario de: " + super.soma + "Bonus de 20%";
	}
}
