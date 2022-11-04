package notaFiscal;

public class FabricaDeNotas {
	
	public Nota criarNota(NotaModel modelo) {
		boolean nota01 = modelo.getTipoNota() == 1;
		if(nota01)
			return new NotaTipo01();
		
		boolean nota02 = modelo.getTipoNota() == 2;
		if(nota02)
			return new NotaTipo02();
		
		throw new IllegalArgumentException("Tipo é invalido escolha um destes tipos: " + modelo.getQuantidadeDeTipos());
	}
	
}
