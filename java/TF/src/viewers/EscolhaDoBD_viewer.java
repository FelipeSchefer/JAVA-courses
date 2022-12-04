package viewers;

import java.util.Scanner;

import enums.BD;
import factory.ConexaoBD_Factory;
import server.ConexaoBD;

public class EscolhaDoBD_viewer {

	public boolean escolherBD() throws Exception {

		@SuppressWarnings("resource")
		Scanner escreva = new Scanner(System.in); 
		
		System.out.println(" ______ Escola de Idiomas ______ ");
		System.out.println("|                               |"); 
		System.out.println("|  O programa está iniciando.   |");
		System.out.println("|            ***                |");
		System.out.println("|  Escolha o Banco de Dados     |");
		System.out.println("|  que deseja usar              |");
		System.out.println("|  para escolher MySQL  tecle 1 |");
		System.out.println("|  ou para       Oracle tecle 2 |");
		System.out.println("|  se quer sair         tecle 3 |");
		System.out.print  ("|_______________________________|\n Escolha 1, 2 ou 3 => ");
		
		int opcao  = 0;
		int MYSQL  = 1;
		int ORACLE = 2;
		int SAIR   = 3;
		
		opcao = escreva.nextInt();
		
		if(opcao == MYSQL) {
			ConexaoBD mySQL = ConexaoBD_Factory.getConectarBD(BD.MySQL); //3 Inversão de dependência e 1 Factory
			System.out.println("\n Você escolhe a conexão " + mySQL.conectar() + "\n");			
		}
		else if(opcao == ORACLE) {
			ConexaoBD oracle = ConexaoBD_Factory.getConectarBD(BD.Oracle);//3 Inversão de dependência e 1 Factory
			System.out.println("\n Você escolhe a conexão " + oracle.conectar() + "\n");
		}
		else if(opcao == SAIR) {
			return true;
		}
		else {
			AlertaViewer alerta = new AlertaViewer();
			alerta.alertarEcolhaBD();
		}
		return false;
	}
}
