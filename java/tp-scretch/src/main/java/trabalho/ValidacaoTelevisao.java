package trabalho;

import java.util.ArrayList;
import java.util.List;

public class ValidacaoTelevisao {
	int TAMANHO_MINIMO 	= 0;
	int TAMANHO_MAXIMO 	= 100;
	int VALIDAR_ERRO 	= -1;
	int VALIDAR_OK 		= 1;
	
	public int validar(String nome, int tamanho) {		
		if(isTelevisaoValida(nome, tamanho)) {
			return VALIDAR_ERRO; 
		}else {
			return VALIDAR_OK; 
		}
	}

	boolean isTelevisaoValida(String nome, int tamanho) {
		return nome.equals("") || (tamanho < TAMANHO_MINIMO || tamanho > TAMANHO_MAXIMO);
	}	

	
	List<Televisao> list = new ArrayList<>();
	public void validar(Televisao televisao) throws Exception {
		
		boolean isTelevisaoVazia = televisao == null;
		if (isTelevisaoVazia) {
			throw new Exception("Objecto Tv esta nulo");
		}
	
		if (televisao.isTelevisaoValida( televisao.nome,  televisao.tamanho)) {
			throw new Exception("Dados da tv estao incorretos");
		}
		
		boolean isNomeTV_Vazio = televisao.nome.equals("");
		if(isNomeTV_Vazio) {
			throw new IllegalArgumentException("Nome invalido");			
		}
		
		boolean isTamanhoTV_Zero = televisao.tamanho <= 0;
		if(isTamanhoTV_Zero) {
			throw new IllegalArgumentException("Tamanho invalido");
		}
	}
}
