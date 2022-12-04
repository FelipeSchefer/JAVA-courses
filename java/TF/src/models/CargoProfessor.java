package models;

import java.util.Arrays;
import java.util.List;

public class CargoProfessor implements Cargos{
	List<String> cargos =  Arrays.asList( "Profesor de Português", 
										  "Profesor de Espanhol",
										  "Profesor de Franês",
										  "Profesor de Inglês",
										  "Profesor de Japonês");
	@Override
	public String escolherCargos(String profissao){
		boolean temIdioma = false;		
		temIdioma = cargos.contains(profissao);
		if(temIdioma) {
			return profissao;					
		}
	
		System.out.println("\n Não foi escrtito um nome valido para curso verifique se " +
			               "o curso existe ou se foi escrito corretamente\n");
		
		return "erro";	
	}
	
	@Override
	public void listarCargos() {
		System.out.print(" * \n");
		System.out.print(" * Lista de cargos disponiveis. Escolha um.\n");
		System.out.print(" * " + cargos.toString() + "\n");
		
	}


}
