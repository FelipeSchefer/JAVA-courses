package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Aluno;
import models.Funcionario;
import threads.ContaUmMinutoListaAlunos;
import viewers.AlertaViewer;
import viewers.AlunoCadastroViewer;
import viewers.BemVindoViewer;
import viewers.EncerraProgamaViewer;
import viewers.EscolhaDoBD_viewer;
import viewers.FuncionarioCadastroViewer;

public class TelaService {

	public void iniciarPrograma() throws Exception {
		@SuppressWarnings("resource")
		Scanner escreva = new Scanner(System.in); 
	
		List<Aluno> alunos = new ArrayList<>();
		List<Funcionario> funcionarios = new ArrayList<>();
		
		ContaUmMinutoListaAlunos listaCursoThread = new ContaUmMinutoListaAlunos(alunos);
		listaCursoThread.start();
		
		boolean sair = false;
		boolean encerrarAplicacao = false;
		do {
			EscolhaDoBD_viewer escolhaBD = new EscolhaDoBD_viewer();
			encerrarAplicacao = escolhaBD.escolherBD();
			
			if(!encerrarAplicacao) {
				BemVindoViewer bv = new BemVindoViewer();
				bv.bemVindo();
				
				int opcao = 0;
				int ALUNO = 1;
				int FUNCIONARIO = 2;
				int SAIR = 3;
				opcao = escreva.nextInt();
				if(opcao == ALUNO) {
					String alunoInfo = "";
					AlunoCadastroViewer alunoViewer = new AlunoCadastroViewer();
					alunoInfo = alunoViewer.cadastrarAluno(alunos);
					System.out.println(alunoInfo);				
				}
				else if(opcao == FUNCIONARIO) {
					String funcionarioInfo = "";
					FuncionarioCadastroViewer funcionarioCadViewer = new FuncionarioCadastroViewer();
					funcionarioInfo = funcionarioCadViewer.cadastrarFuncionario(funcionarios);
					System.out.println(funcionarioInfo);
				}
				else if(opcao == SAIR) {
					String finalizando = "";
					EncerraProgamaViewer encerraPrograma = new EncerraProgamaViewer();
					finalizando = encerraPrograma.encerrarPrograma();
					System.out.println(finalizando);
					sair = true;
				}
				else {
					AlertaViewer alerta = new AlertaViewer();
					alerta.alertar();
				}				
			}
			if(encerrarAplicacao) {
				String finalizando = "";
				EncerraProgamaViewer encerraPrograma = new EncerraProgamaViewer();
				finalizando = encerraPrograma.encerrarPrograma();
				System.out.println(finalizando);
				sair = encerrarAplicacao;
			}
		}while(!sair);
		
		if(sair) listaCursoThread.stop();
	}
}
