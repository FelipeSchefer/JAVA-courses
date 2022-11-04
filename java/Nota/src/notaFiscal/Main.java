package notaFiscal;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		NotaModel notaModel01 = new NotaModel();
		notaModel01.setTipoNota(1);
		notaModel01.setNumeroNota(001);
		notaModel01.setValor(100);
		notaModel01.setValor(200);
		notaModel01.setValor(50);
		notaModel01.setObservacao("Compra Feita com sucesso");
		
		NotaModel notaModel02 = new NotaModel();
		notaModel02.setTipoNota(2);
		notaModel02.setNumeroNota(002);
		notaModel02.adicionarItem("Leite", 10.50d);
		notaModel02.adicionarItem("Frango", 15.60d);
		notaModel02.setDescricao("Deve ser pago no caixa");
		
//		NotaModel notaModel03 = new NotaModel();

		ArrayList<NotaModel> listaNota = new ArrayList<>(); 
		listaNota.add(notaModel01);
		listaNota.add(notaModel02);

//		listaNota.add(notaModel03);
		
		FabricaDeNotas fabricaVeiculo = new FabricaDeNotas();
		
		for(NotaModel TipoDeNota : listaNota) {
			Nota nota = fabricaVeiculo.criarNota(TipoDeNota);
			nota.gerar(TipoDeNota);
		}
	}
}
