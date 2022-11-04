package aula7;

public class CadastroProduto {
	public void mostrarAlgumaCoisa() {
		ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();
		
		System.out.println("nome sistema é: " + config.getNomeSistema());

	}
}
