package exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner escreva = new Scanner(System.in); 
		
		List<Produto> produtoLista = new ArrayList<Produto>();
		produtoLista.add(new Produto("borracha", 1.10d));
		produtoLista.add(new Produto("caneta", 2.20d));
		produtoLista.add(new Produto("copo", 3.30d));

		ContaQuizeSegundos contaQuizeSegundos = new ContaQuizeSegundos(produtoLista);
		contaQuizeSegundos.start();
		
		CadastraProduto cadProduto = new CadastraProduto(produtoLista);
		boolean sair = false;
		while(sair == false) {
			System.out.println("----------- MENU -----------"); 
			
			System.out.println("Para cadastrar um produto digite c ");
			System.out.println("Para remover um produto digite r ");
			System.out.println("Para siar do programar digite s\n ");
					
			String opcao = "";
			opcao = escreva.next();
			
			if("c".equals(opcao)) {
				cadProduto.cadastrarProduto();				
			}
			else if("r".equals(opcao)) {
				System.out.println("Escreva o item que deseja excluir");
				cadProduto.removerProduto(escreva.next());		
			}
			else if("s".equals(opcao))
				sair = true;
			else
				System.out.println("Por favor escolha conferme uma das opções menciandas anteriormente (c - r - s )");
			
			System.out.println("-----------------------------");
		}
	}
}
