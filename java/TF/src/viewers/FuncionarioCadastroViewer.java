package viewers;

import java.util.List;
import java.util.Scanner;
import models.Funcionario;

public class FuncionarioCadastroViewer {

	public String cadastrarFuncionario(List<Funcionario> funcionarios) throws Exception {
		
		@SuppressWarnings("resource")
		Scanner escreva = new Scanner(System.in); 
		
		String profissional = "";
		int opcao = 0;
		int PROFESSOR = 1;
		int RH = 2;
		
		System.out.println("");
		System.out.print( 
				" _____________ Cadastro de Funcionario __________________\n"  +
				"|                                                        |\n" + 
				"| Você deseja cadastrar um Professor ou uma Pessoa do RH |\n" +
				"| Se você deseja cadastrar Professor        tecle 1      |\n" +
				"| Caso queira cadastrar    Pessoa do Rh     tecle 2      |\n" +
				"| Para sair do programa                     tecle 3      |\n" +
				"|________________________________________________________|\n Escolha 1, 2 ou 3 => ");
		
		opcao = escreva.nextInt();
		
		if(opcao == PROFESSOR) {
			ProfessorCadastroViewer professor = new ProfessorCadastroViewer();
			profissional = professor.cadastrarFuncionario(funcionarios);
		}
		else if(opcao == RH) {
			RH_cadastroViewer rh = new RH_cadastroViewer();
			profissional = rh.cadastrarFuncionario(funcionarios);
		}
		
		return profissional;
	}
}
