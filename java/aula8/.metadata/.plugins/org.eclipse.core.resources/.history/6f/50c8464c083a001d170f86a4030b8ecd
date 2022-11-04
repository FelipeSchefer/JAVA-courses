package aula7;

public class FabricaVeiculo {

	public Veiculo criarVeiculo(String tipo) {
		
		if("kwid".equals(tipo)) {
			return new KwidVeiculo();
		}
		if("gol".equals(tipo)) {
			return new GolVeiculo();
		}
		throw new IllegalArgumentException("tipo e invalido");
		
	}
	
	public <T extends Veiculo> Veiculo criarVeiculo(Class<T> c)
					throws Exception {
		
		return c.getDeclaredConstructor()
				.newInstance(null);
		
	}
}
