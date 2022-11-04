package aula7a;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> listaCarro = new ArrayList<>(); 
		listaCarro.add("gol");
		listaCarro.add("kwid");

		listaCarro.add("opala");
		
		FabricaVeiculo fabricaVeiculo = new FabricaVeiculo();
		
		for(String carro : listaCarro) {
			Veiculo veiculo = fabricaVeiculo.criarVeiculo(carro);
			veiculo.andar();
			veiculo.parar();
		}
	}

}
