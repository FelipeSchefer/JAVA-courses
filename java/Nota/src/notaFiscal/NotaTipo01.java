package notaFiscal;

public class NotaTipo01 implements Nota{

	@Override
	public void gerar(NotaModel nota) {
		int numeroNota = nota.getNumeroNota();
		double valorTotal = nota.somarValorTotal();
		String observacao = nota.getObservacao();

		System.out.println("------------ NOTA TIPO 01 ------------");
		System.out.println("Numero da nota: " + numeroNota);
		System.out.println("Valor total: " + valorTotal);
		System.out.println("Observacao: " + observacao);
		System.out.println("--------------------------------------");
	}
}
