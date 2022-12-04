package server;

/* 3
 * 
 * Dependency Inversion Principle 
 */
public class ConexaoOracle implements ConexaoBD{

	@Override
	public String conectar() {
		return "Oracle";
	}

}
