package threads;

import java.util.List;

import models.Aluno;

public class ContaUmMinutoListaAlunos extends Thread{
	private final long UM_MINUTO = 60000;
	List<Aluno> listaAluno;
	
	public ContaUmMinutoListaAlunos(List<Aluno> listaAluno) {
		this.listaAluno = listaAluno;
	}
	
	public void run() {
		setName("Verifica lista de alunos a cada 15 segundos");
		cronometrarQuizeSegundos();
	}
	
	public void cronometrarQuizeSegundos() {
		try {
			while(true) { 
				System.out.println("");
				System.out.println("\nTamanho da lista de Alunos " + this.listaAluno.size());
			
				for(Aluno lista : this.listaAluno) {
					System.out.println(lista.toString());
				}
				
				Thread.sleep(UM_MINUTO);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
