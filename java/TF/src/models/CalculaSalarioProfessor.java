package models;

/* 4
 * 
 * Liskov Substitution Principle 
 */
public class CalculaSalarioProfessor extends CalculaSalario{

	double BONUS = 1.10d;
	
	public CalculaSalarioProfessor(String profissao, Double valorHora, Integer horas) {
		super(profissao, valorHora, horas);
	}

	public String somar() {
		
		super.soma = (valorHora * horas) * BONUS;
		
		return " Profissão: " + profissao + " Salario de: " + super.soma + "Bonus de 10%";
	}

}
