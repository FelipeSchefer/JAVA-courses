package viewers;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import factory.PessoaFactory;
import models.Aluno;
import models.Cursos;
import models.Endereco;

/* 1
 * 
 * Single Responsibility Principle
 */
public class AlunoCadastroViewer {
	public String cadastrarAluno(List<Aluno> alunos) throws InputMismatchException {
		try {
			@SuppressWarnings("resource")
			Scanner escreva = new Scanner(System.in); 
			Aluno aluno = PessoaFactory.getAluno();
			String nome = "";
			Integer idade = 0;
			String rua = "";
			Integer numero = 0;
			String complemento = "";
			Cursos cursos = new Cursos();
			String nomeCurso = "";
			String curso = "";
			String mostrarInfo = "";
			
			System.out.println("\n");
			System.out.println(" _____ Muito bem você escolheu cadastrar Aluno _____ ");
			System.out.println(" *       Por favor preencha os dados do aluno        ");
			
			System.out.print(" * Nome: ");
			nome = escreva.next();
			aluno.setNome(nome);
			
			System.out.print(" * Idade: ");
			idade = escreva.nextInt();
			aluno.setIdade(idade);
			
			System.out.print(" * Rua: ");
			rua = escreva.next();
			
			System.out.print(" * Numero: ");
			numero = escreva.nextInt();
			
			System.out.print(" * Complemento: ");
			complemento = escreva.next();
			Endereco enderecoAluno = new Endereco(rua, numero, complemento);
			aluno.setEndereco(enderecoAluno);
			
			cursos.listarCursos();
			boolean erro = false;
			do {
				System.out.print(" * Idioma do curso: ");
				nomeCurso = escreva.next();
				curso = cursos.escolherCursos(nomeCurso);
				erro = curso.equals("erro");
			}while(erro);
			
			aluno.setCurso(curso);
			
			mostrarInfo = "\n" + aluno.toString() + "\n";
			
			alunos.add(aluno);
			
			return mostrarInfo;
			
		}
		catch(InputMismatchException exception) {
			return "\n Você deve usar numeros com Virgula ( , )\n " + exception + 
				   "\n Repita o porcesso de cadastro por favor.\n";
		}
	}
}
