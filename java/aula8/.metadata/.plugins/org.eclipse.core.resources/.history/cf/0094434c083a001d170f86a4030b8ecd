package aula7;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Aula7Main {

	public static void main(String[] args) throws Exception {
	
		ConfiguracaoSistema config = ConfiguracaoSistema.getInstance();
		config.setNomeSistema("aula senai");
		System.out.println("nome sistema é: " + config.getNomeSistema());

		ConfiguracaoSistema config1 =  ConfiguracaoSistema.getInstance();
		config1.setNomeSistema("abc");
		System.out.println("nome sistema é: " + config1.getNomeSistema());
		
		CadastroProduto cadastroProduto = new CadastroProduto();
		cadastroProduto.mostrarAlgumaCoisa();
		
		ArrayList<String> listaCarro = new ArrayList<>();
		listaCarro.add("gol");
		listaCarro.add("kwid");		
		
		FabricaVeiculo fabricaVeiculo = new FabricaVeiculo();
		
		for(String carro : listaCarro) {
			Veiculo veiculo = fabricaVeiculo.criarVeiculo(carro);
			veiculo.andar();
			veiculo.parar();
		}
		
		ArrayList<Class> listaCarroClass = new ArrayList<>();
		listaCarroClass.add(KwidVeiculo.class);
		listaCarroClass.add(GolVeiculo.class);
		
		for(Class carro : listaCarroClass) {
			Veiculo veiculo = fabricaVeiculo.criarVeiculo(carro);
			veiculo.andar();
			veiculo.parar();
		}
		
	
		ConectaBanco conectaBanco = ConectaBanco.getInstancia();
		conectaBanco.conecta();
		
		Pizza pizzaSemBuilder = new Pizza();
		pizzaSemBuilder.setBacon(true);
		pizzaSemBuilder.setQueijo(true);
		pizzaSemBuilder.setTomate(false);
		
		Pizza pizzaComBuilder = new BuilderPizza()
								.comBacon()
								.comTomate()
								.comQueio()
								.criarPizza();
		
		
	}

}
