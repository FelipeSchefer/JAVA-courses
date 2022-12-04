package models;

/* 2
 * 
 * Open-Closed Principle
 * 
 * Sempre que precisar adicionar cargos de diferentes setores pode-se usar 
 * o conseito Aberto-Fechado
 */
public class CargoRH extends Cargos{
	
	@Override
	@SuppressWarnings("unlikely-arg-type")
	public String escolherCargos(String profissao) throws Exception {

		super.cargos.add("Recrutador");
		super.cargos.add("Departamento Pessoal");
		super.cargos.add("Treinador");
		super.cargos.add("Financeiro");
		
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
	
	public void listarCargos() {
		System.out.print(" * \n");
		System.out.print(" * Lista de cargos disponiveis. Escolha um.\n");
		System.out.print(" * " + cargos.toString() + "\n");
	}
}
