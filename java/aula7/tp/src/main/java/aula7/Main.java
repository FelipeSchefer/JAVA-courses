package aula7;

public class Main {

	public static void main(String[] args) {
		
		ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();
		config.setNomeSistema("SENAI");
		
		System.out.println("nome sistema é: " + config.getNomeSistema());
		

		ConfiguracaoSistema config1 = ConfiguracaoSistema.getInstancia();
		config1.setNomeSistema("SENAC");
		
		System.out.println("nome sistema é: " + config1.getNomeSistema());
		System.out.println("nome sistema é: " + config.getNomeSistema());
		
		CadastroProduto cadProduto = new CadastroProduto();
		cadProduto.mostrarAlgumaCoisa();
		

	}

}
