package trabalho;

public class Cadastro extends ValidacaoTelevisao{

	public void adicionar(Televisao televisao) {
		try {
			validar(televisao);
			list.add(televisao);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public Televisao buscarTelevisao(String nome) throws Exception {
		Televisao retornaTelevisao = null;
		for (Televisao televisaoList : list) {
			if (televisaoList.nome.equals(nome)) {
				retornaTelevisao = televisaoList;
			}else {
				validar(retornaTelevisao);				
			}
		}
		return retornaTelevisao;
	}
}
