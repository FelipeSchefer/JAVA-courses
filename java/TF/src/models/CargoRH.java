package models;

import java.util.Arrays;
import java.util.List;

/* 2
 * 
 * Open-Closed Principle
 * 
 * Sempre que precisar adicionar cargos de diferentes setores pode-se usar 
 * o conseito Aberto-Fechado
 */
public class CargoRH implements Cargos{
	List<String> cargos =  Arrays.asList( "Recrutador", 
										  "Departamento Pessoal",
										  "Treinador",
										  "Financeiro");
	
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
