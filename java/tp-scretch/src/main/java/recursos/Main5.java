package recursos;

public class Main5 {

	public static void main(String[] args) {

		/*
		 * A 1 impl. de log, deve mostrar na console: LOG:( texto_inserido )
		 * A 2 impl. de log, deve mostrar na console: LOG- texto_inserido
		 */
		
		
		// inserir o log na calculadora
		Calculadora cal = new Calculadora();
		int res = cal.somar(2, 3);
		System.out.println("resultado soma: " + res);
		// inserir o outro log na calculadora
		res = cal.somar(5, 4);
		System.out.println("resultado soma: " + res);
		

	}

}
