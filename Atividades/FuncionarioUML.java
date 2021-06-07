package atividades;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioUML {

	String nome;
	private int matricula;
	double salario;
	String dataAdmissao;
	private long cpf;

	public FuncionarioUML() {

	}

	public FuncionarioUML(int matricula, String nome, double salario, long cpf, String dataAdmissao) {

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

		inss = (salario * 11) / 100;

		if (salario > 2500) {

			ir = ((salario - 2500) * 17.5) / 100;

		}
		imposto = inss + ir;

		return imposto;

	}

	public double calcularGanhoLiquidoAnual() {

		double liquido;
		liquido = calcularGanhoBrutoAnual() + (calcularImposto() * 12);
		return liquido;
	}

	public void adicionaFunc(int matricula, String nome, double salario, long cpf, String dataAdmissao) {

		Connection cn = ConexaoTeste.getConnection().Conn();
		try {
			PreparedStatement pStmt = cn.prepareStatement("insert into funcionario values (?, ?, ? ,? ,?)");
			pStmt.setInt(1, matricula);
			pStmt.setString(2, nome);
			pStmt.setDouble(3, salario);
			pStmt.setLong(4, cpf);
			pStmt.setString(5, dataAdmissao);
			pStmt.executeUpdate();
			cn.commit();
			cn.close();

		} catch (SQLException e) {

			if (e.getErrorCode() == 1062) {

				System.out.println("A PK ESTÁ DUPLICADA, ALTERAÇÃO NÃO SERÁ EFETUADA");
			}

		} catch (Exception e) {

			System.out.println(e);
		}
	}

	public void retornaFunc() {

		Connection cn = ConexaoTeste.getConnection().Conn();

		try {
			Statement st = cn.createStatement();
			st.executeQuery("Select * from funcionario");
			ResultSet rs = st.getResultSet();

			while (rs.next()) {
				System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - "
						+ rs.getString(4) + " - " + rs.getString(5));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
