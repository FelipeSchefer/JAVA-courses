package aula7;

public class ConfiguracaoSistema {
	private String nomeSistema;

	private ConfiguracaoSistema() {}
	
	private static ConfiguracaoSistema instancia;
	
	public static ConfiguracaoSistema getInstancia() {
		if(instancia == null)
			instancia = new ConfiguracaoSistema();
		
		return instancia;
	}
	
	public String getNomeSistema() {
		return nomeSistema;
	}

	public void setNomeSistema(String nomeSistema) {
		this.nomeSistema = nomeSistema;
	}	
}
