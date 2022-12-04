package models;

public class Aluno implements Pessoa{

	private String nome;
	private int idade;
	private String curso;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\n Aluno Nome " + getNome() + ", Idade " + getIdade() + ", Curso " + getCurso() +
			   "\n Endereco " + getEndereco();
	}
	
	
}
