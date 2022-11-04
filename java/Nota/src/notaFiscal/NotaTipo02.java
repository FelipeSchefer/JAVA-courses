package notaFiscal;

import java.util.HashMap;
import java.util.Iterator;

public class NotaTipo02 implements Nota {

	@Override
	public void gerar(NotaModel nota) {
		HashMap<String, Double> itens = nota.getItens();
		int numeroNota = nota.getNumeroNota();
		String descricao = nota.getDescricao();

		System.out.println("------------ NOTA TIPO 02 ------------");
		System.out.println("Numero da nota: " + numeroNota);
		
		Iterator<String> i = itens.keySet().iterator();
	    while (i.hasNext()) {
	         String key = (String) i.next();
	         System.out.println("Item: " + key + " valor: " + itens.get(key));
	    }
		
		System.out.println("Descricao: " + descricao);
		System.out.println("--------------------------------------");
	}
}
