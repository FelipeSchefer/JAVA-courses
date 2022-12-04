package models;

import java.util.Arrays;
import java.util.List;

public class Cursos {
	List<String> cursos = Arrays.asList(  "Português", 
										  "Espanhol",
										  "Franês",
										  "Inglês",
										  "Japonês");
	
	public String escolherCursos(String idioma) {
		boolean temIdioma = false;		
		temIdioma = cursos.contains(idioma);
		if(temIdioma) {
			return idioma;					
		}
	
		System.out.println("\n Não foi escrtito um nome valido para curso verifique se " +
			               "o curso existe ou se foi escrito corretamente\n");
		
		return "erro";
	}
	
	public void listarCursos() {
		System.out.print(" * \n");
		System.out.print(" * Lista de cursos disponiveis. Escolha um.\n");
		System.out.print(" * " + cursos.toString() + "\n");
	}
}
