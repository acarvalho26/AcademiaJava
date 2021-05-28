package atividades;

public class FuncionarioUML {
	
	String nome;
	private int matricula;
	double salario;
	String dataAdmissao;
	private long cpf;
	
	
	public FuncionarioUML() {
		
	}
	
	public FuncionarioUML(String nome, int matricula, double salario, String dataAdmissao, long cpf) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
	public void receberAumento(double aumento) {
		
		setSalario(aumento + getSalario());
		
	}
	
	public double calcularGanhoBrutoAnual() {
		
		double ganhobruto = getSalario() * 12;
		return ganhobruto;

	}
	
	public double calcularImposto() {
		double inss;
		double ir = 0;
		double imposto;
		
		
		inss = (salario*11)/100;
		
		if (salario > 2500) {
			
			ir = ((salario-2500)*17.5)/100;
			
		}
		imposto = inss + ir;
		
		return imposto;
		
	}
	
	public double calcularGanhoLiquidoAnual() {
		
		double liquido;
		liquido = calcularGanhoBrutoAnual() + (calcularImposto()*12);
		return liquido;
	}
	
	
	
	

}





