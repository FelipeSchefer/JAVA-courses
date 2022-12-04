package viewers;

import java.util.List;
import java.util.Scanner;

import factory.PessoaFactory;
import models.CalculaSalario;
import models.CalculaSalarioProfFrances;
import models.CargoProfessor;
import models.Endereco;
import models.Funcionario;

/* 1
 * 
 * Single Responsibility Principle
 */
public class ProfessorCadastroViewer {
	public String cadastrarFuncionario(List<Funcionario> funcionarios) throws Exception {
		@SuppressWarnings("resource")
		Scanner escreva = new Scanner(System.in); 
		Funcionario funcionario = PessoaFactory.getFuncionario();
		String nome = "";
		Integer idade = 0;
		String rua = "";
		Integer numero = 0;
		String complemento = "";
		CargoProfessor cargos = new CargoProfessor();
		String nomeCargo = "";
		String cargo = "";
		String mostraSalario = "";
		String mostrarInfo = "";
		Double valorHora = 0d;
		Integer hora = 0;
		
		System.out.println("\n");
		System.out.println(" _____ Muito bem você escolheu cadastrar Professor _____ ");
		System.out.println(" *       Por favor preencha os dados do professor        ");
		
		System.out.print(" * Nome: ");
		nome = escreva.next();
		funcionario.setNome(nome);
		
		System.out.print(" * Idade: ");
		idade = escreva.nextInt();
		funcionario.setIdade(idade);
		
		System.out.print(" * Rua: ");
		rua = escreva.next();
		
		System.out.print(" * Numero: ");
		numero = escreva.nextInt();
		
		System.out.print(" * Complemento: ");
		complemento = escreva.next();
		Endereco enderecoAluno = new Endereco(rua, numero, complemento);
		funcionario.setEndereco(enderecoAluno);
		
		cargos.listarCargos();
		boolean erro = false;
		do {
			System.out.print(" * Nome da Profissão: ");
 		    nomeCargo= escreva.nextLine();
			cargo = cargos.escolherCargos(nomeCargo);
			erro = cargo.equals("erro");
			
		}while(erro);
		
		funcionario.setCargo(nomeCargo);
		
		System.out.print(" * Valor da hora: ");
		valorHora = escreva.nextDouble();
		
		System.out.print(" * Quantidade de horas de serviço: ");
		hora = escreva.nextInt();
		CalculaSalario profIngles = new CalculaSalarioProfFrances(nomeCargo ,valorHora , hora ); // 4 Liskov Substitution Principle 
		mostraSalario = profIngles.somar();
		
		mostrarInfo = "\n" +  funcionario.toString() + "\n" + mostraSalario + "\n";
		
		funcionarios.add(funcionario);
		
		return mostrarInfo;
	}
}
