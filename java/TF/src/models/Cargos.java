package models;

import java.util.Arrays;
import java.util.List;

public interface Cargos {
	List<String> cargos = Arrays.asList();
	
	public String escolherCargos(String profissao) throws Exception;
	
	public void listarCargos();
}
