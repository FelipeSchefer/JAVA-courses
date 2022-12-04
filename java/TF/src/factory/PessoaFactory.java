package factory;

import models.Aluno;
import models.Funcionario;
/* 0
 * 
 * Factory 
 */
public class PessoaFactory {

	public static Aluno getAluno() {
		return new Aluno();
	}
	
	public static Funcionario getFuncionario() {
		return new Funcionario();
	}
}
