package recursos;

public class FuncionarioServico {

	
	public int editarFuncionario(Funcionario funcionario) {
                try
                {
         ValidaFuncionario(funcionario);                
                }catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
                int retorno = processaEditarFuncionarario(funcionario);
                return retorno;
    }
    public int processaEditarFuncionarario(Funcionario f) {
        // processa a edicao do funcionario.
                    boolean sucessoEdicao = true;
        if (sucessoEdicao){
        return 1; // sucesso
        }
        else{
            return -1; // error na edicao.
        }
    }
    private void ValidaFuncionario(Funcionario funcionario) throws Exception
    {
        if(funcionario.id == 0)
        {
            throw new Exception("Funcionario deve ter um ID");
        }            
    }
    Funcionario funcionario;
	
}
