package factory;

import enums.BD;
import server.ConexaoBD;
import server.ConexaoMySQL;
import server.ConexaoOracle;
/* 0
 * 
 * Factory 
 */
public class ConexaoBD_Factory {

	public static ConexaoBD getConectarBD(BD nomeBD) throws Exception{
		try {
			if(nomeBD.equals(BD.MySQL))
				return new ConexaoMySQL();
			if(nomeBD.equals(BD.Oracle))
				return new ConexaoOracle();						
		}
		catch(Exception e) {
			return (ConexaoBD) e;
		}
		throw new IllegalArgumentException("Nenhum banco de dados conhecido foi selecionado");
	}
}
