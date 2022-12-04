package server;

/* 3
 * 
 * Dependency Inversion Principle 
 */

public class ConexaoDAO {
	public void salvar(ConexaoBD bd) {
		System.out.println("Tu te conectaste ao " + bd);
	}
}
/* 3
 *
 * Aqui podes ver a inversão de dependecia. Como ela funciona?
 * É criado uma interface neste caso ConexaoBD que será implementadas em outras classes de Banco de Dados
 * neste projeto ela é implementada nas classes ConexaoMySQL e ConexaoOracle. O proposito da inversão de 
 * dependencias é fazer com que a classe seja generica aceitando qualquer tipo de banco sem ter que alterar os
 * metodos em outras classes.
 * 
 */