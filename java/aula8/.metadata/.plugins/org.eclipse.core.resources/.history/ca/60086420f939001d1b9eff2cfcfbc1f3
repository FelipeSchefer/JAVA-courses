package aula2;
// INSERIR PACOTE SE NECESSARIO



public class CalculadoraPag {
    
    float resu = 0; // resultado final
    public CalculadoraPag(String nome, int idade,
            String dataNascimento,float salario){
        Funcionario funcionario = new Funcionario();
        funcionario.dataNascimento = dataNascimento;
        funcionario.idade = idade;
        funcionario.nome = nome;
        funcionario.salario = salario;    
		try{
			validaFuncionario(funcionario);
		}catch(Exception i){
			System.out.println("errro na validação");
		}
        resu = calcula(funcionario);
    }
    
	void validaFuncionario(Funcionario f) throws Exception{
		if(f.nome.equals("") || f.idade ==0){
			throw new Exception("error funcionario");
		}
	}
	
    public float retornaCalculoFuncionario(){
        return resu;
    }
    // esse metodo calcula o salario do funcionario
    private float calcula(Funcionario f){
		
		
        float r = 0;
        if(salarioJunior(f)){
            r = (f.salario * 0.1f) + f.salario;
        }
        if(f.salario > 1000){
            r = (f.salario * 0.2f) + f.salario;
        }
        
        return r;        
    }

	private boolean salarioJunior(Funcionario f) {
		return f.salario < 1000;
	}
    
}




       



