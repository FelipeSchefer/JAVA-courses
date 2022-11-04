package aula8;

public class PedidoFacade {

	private ModuloEstoque moduloEstoque = new ModuloEstoque();
	private ModuloFinanceiro moduloFinanceiro = new ModuloFinanceiro();
	private ModuloPosVenda moduloPosVenda = new ModuloPosVenda();
			
	
	public void executarPedido(Pedido pedido) {
		moduloEstoque.enviarPedido(pedido);
		moduloFinanceiro.faturar(pedido);
		moduloPosVenda.agendarContatoCliente(pedido);
	}
	
}
