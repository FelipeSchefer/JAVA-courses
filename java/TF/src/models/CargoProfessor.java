package models;

import java.util.ArrayList;
import java.util.List;

/* 1
 * 
 * Single-Responsibility Principle
 * 
 * Aqui só tem uma responsabilidade de retornar o cargo(profissao) da pessoa
 */
public class CargoProfessor extends Cargos{
	List<String> cargos = new ArrayList<>();
	
	@SuppressWarnings("unlikely-arg-type")
	public String escolherCargos(String profissao) throws Exception{
		cargos.add("Profesor de Português");
		cargos.add("Profesor de Espanhol");
		cargos.add("Profesor de Francês");
		cargos.add("Profesor de Inglês");
		cargos.add("Profesor de Japonês");
		
		try {
			boolean temProfissao = false;
			for(String cargo : cargos) {
				temProfissao = cargos.equals(profissao);
				if(temProfissao) 
					profissao = cargo;
			}
			
			return profissao;
		}
		catch(Exception e) {
			return "Não foi escrtito um nome valido para cargo verifique se o curso existe ou se foi escrito  " +
				   "corretamente" + e;
		}	
	}
	
	public void listarCursos() {
		System.out.print(" * \n");
		System.out.print(" * Lista de cargos disponiveis. Escolha um.\n");
		System.out.print(" * " + cargos.toString() + "\n");
	}
}
