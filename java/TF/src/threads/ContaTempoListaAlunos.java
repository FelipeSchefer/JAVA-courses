package threads;

import java.util.List;

import models.Aluno;
import models.Funcionario;

public class ContaTempoListaAlunos extends Thread{
	private final long TEMPO = 180000;
	List<Aluno> listaAluno;
	List<Funcionario> listaFuncionarios;
	
	public ContaTempoListaAlunos(List<Aluno> listaAluno, List<Funcionario> listaFuncionarios) {
		this.listaAluno = listaAluno;
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public void run() {
		setName("Verifica lista de alunos e funcionarios a cada 3 minutos");
		cronometrarQuizeSegundos();
	}
	
	public void cronometrarQuizeSegundos() {
		try {
			while(true) { 
				System.out.println("\n=============================================================================");
				System.out.println("\nTamanho da lista de Alunos " + this.listaAluno.size());
			
				for(Aluno lista : this.listaAluno) {
					System.out.println(lista.toString());
				}
				
				System.out.println("\n=============================================================================");
				
				System.out.println("\n=============================================================================");
				System.out.println("\nTamanho da lista de Funcionarios " + this.listaFuncionarios.size());
			
				for(Funcionario lista : this.listaFuncionarios) {
					System.out.println(lista.toString());
				}
				
				System.out.println("\n=============================================================================");
				
				Thread.sleep(TEMPO);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
