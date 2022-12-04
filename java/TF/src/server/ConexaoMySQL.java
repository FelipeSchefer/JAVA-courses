package server;

/* 3
 * 
 * Dependency Inversion Principle 
 */
public class ConexaoMySQL implements ConexaoBD{

	@Override
	public String conectar() {
		return "MySQL";
	}

}
