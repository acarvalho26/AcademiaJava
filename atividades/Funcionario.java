package atividades;

public class Funcionario {
	
	private String nome;
	
	private String sobrenome;
	
	protected int horasTrabalhadas;
	
	protected double valorPorHora;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sobrenome, int horasTrabalhadas, double valorPorHora) {
	
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public void nomeCompleto() {
		System.out.println("o nome do funcionário é: " + getNome() + " " + getSobrenome());
	}
	
	public void calcularSalario() {
		System.out.println("O salário é: " + (getHorasTrabalhadas() * getValorPorHora()));
	}
	
	public void incrementarHoras(int horas) {
		setHorasTrabalhadas(horas + getHorasTrabalhadas());
		
		System.out.println("adicionando a quantidade de: " + horas + " " + "horas " + "às horas trabalhadas do funcionario");
	}
	

	
	
	
	
	
	
	

}
