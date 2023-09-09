package entities;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario() {

	}

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalario() {
		return salario;
	}

	public void aumentarSalario(Double porcentagem) {
		this.salario += this.salario * porcentagem / 100;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + salario;
	}

}
