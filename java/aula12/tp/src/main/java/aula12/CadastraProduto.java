package aula12;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CadastraProduto {
	List<Produto> produtoLista;

	public CadastraProduto() {}
	
	public CadastraProduto(List<Produto> produtoLista) {
		super();
		this.produtoLista = produtoLista;
	}
	
	public void cadastrarProduto() throws InputMismatchException {
		Scanner escreva = new Scanner(System.in); 
		String nome = "";
		Double preco;
		boolean sair = true;
		int entrarOuSai = 1;
		try {
			do {
				Produto produto = new Produto();	
				
				System.out.println("---------- CADASTAR PRODUTO ----------");
				System.out.println("digite o nome do produto");
				nome = escreva.next();
				produto.setNome(nome);
				
				System.out.println("digite o valor");
				preco = escreva.nextDouble();
				produto.setPreco(preco);
				
				produtoLista.add(produto);
				
				System.out.println("Produto "+ produto.getNome() + " e o preco " + produto.getPreco() + " cadastrados.");
				
				while(true) {
					System.out.println("Precione 1 para cadastrar mais um produto ou 0 para sair");
					entrarOuSai = escreva.nextInt();
					
					if(entrarOuSai == 1) {
						sair = true;
						break;
					}
					else if(entrarOuSai == 0) {
						sair = false;
						break;
					}
					else {
						System.out.println("Voce deve inserir escolher 1 oo 2.");
						break;
					}
				}

			}while(sair != false);
			System.out.println("----------------------------------------");
		}
		catch(InputMismatchException exception) {
			System.out.println("Deves por um numero com virgula ' , '. \nNome da exceção " + exception);
		}
	}
	
	public void removerProduto(String nome) {
		System.out.println("---------- REMOVER PRODUTO DA LISTA ----------");

		for(Iterator<Produto> iterator = produtoLista.iterator(); iterator.hasNext();) {
			Produto produto = (Produto) iterator.next();
			if(nome.equals(produto.getNome())) {
				System.out.println("Estás removendo: " + nome);
				iterator.remove();
			}
		}
		System.out.println("-----------------------------------------------"); 
	}	
}
