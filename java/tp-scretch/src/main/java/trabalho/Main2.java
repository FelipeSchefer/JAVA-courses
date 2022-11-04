package trabalho;

public class Main2 {

	public static void main(String[] args) throws Exception {
		Televisao televisao1 = new Televisao("samsung",42);
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.adicionar(televisao1);
		cadastro.buscarTelevisao("samsung");
		System.out.println("Nome: " + televisao1.nome + " tamanho: " + televisao1.tamanho + " polegadas.");
		
		System.out.println(cadastro.buscarTelevisao("cce"));
		

	}

}
