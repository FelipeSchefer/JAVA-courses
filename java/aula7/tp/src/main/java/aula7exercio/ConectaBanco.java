package aula7exercio;

public class ConectaBanco {

	private String nomeBanco;
	
	public ConectaBanco() {}
	
	private static ConectaBanco instancia;
	
	public static ConectaBanco getInstancia() {
		if(instancia == null)
			instancia = new ConectaBanco();
		
		return instancia;
	}
	
	public String conecta() {
		return "está conectando a um banco " + this.getNomeBanco();
	}

	
	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
}
