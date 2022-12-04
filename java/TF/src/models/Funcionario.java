package models;

public class Funcionario implements Pessoa{
	
	private String nome;
	private int idade;
	private String cargo;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\n Funcionario Nome " + getNome() + ", Idade " + getIdade() + ", Cargo " + getCargo() +
			   "\n Endereco " + getEndereco();
	}
	
	
}
