package aula7exercio;

public class Main {

	public static void main(String[] args) {
		
		ConectaBanco  conBanco = ConectaBanco.getInstancia();
		conBanco.setNomeBanco("sql server ");
		System.out.println(conBanco.conecta());
		

		ConectaBanco  conBanco2 = ConectaBanco.getInstancia();
		conBanco2.setNomeBanco("MySQL ");
		System.out.println(conBanco.conecta());
		
		System.out.println(conBanco.conecta());
		
	}

}
