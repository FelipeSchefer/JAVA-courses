package aula12;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CadastraProduto {
	List<Produto> produtoLista;
//	CadastraProduto<Produto> cadProduto;
//	private final int TRES_SEGUNDOS = 3000;

	public CadastraProduto() {}
	
	public CadastraProduto(List<Produto> produtoLista) {
		super();
		this.produtoLista = produtoLista;
	}
	
	public void cadastrarProduto() throws InputMismatchException {
		Produto produto = new Produto();	
		Scanner escreva = new Scanner(System.in); 
		String nome = "";
		Double preco;
		
		try {
			System.out.println("digite o nome do produto");
			nome = escreva.next();
			produto.setNome(nome);
			
			System.out.println("digite o valor");
			preco = escreva.nextDouble();
			produto.setPreco(preco);
			
			produtoLista.add(produto);
			System.out.println("nome "+ produto.getNome() + " e o preco " + produto.getPreco());			
		}
		catch(InputMismatchException exception) {
			System.out.println("Deves por um numero com virgula ' , '. \nNome da exceção " + exception);
		}
	}
	
	public void removerProduto() {
		System.out.println("removido"); 
	}	
}
