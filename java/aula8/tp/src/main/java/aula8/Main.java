package aula8;

public class Main {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		PedidoFacade pedidoFacade = new PedidoFacade();
		pedidoFacade.executarPedido(pedido);
	}

}
