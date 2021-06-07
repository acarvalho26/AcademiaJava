package atividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Filme {

	private String titulo;

	private int duracaoEmMinutos;

	public Filme() {

	}

	public Filme(String titulo, int duracaoEmMinutos) {

		this.titulo = titulo;
		this.duracaoEmMinutos = duracaoEmMinutos;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void exibirDuracaoEmHoras() {

		int hora;
		int minutos;

		minutos = getDuracaoEmMinutos() % 60;
		hora = (getDuracaoEmMinutos() - minutos) / 60;

		if (hora >= 1 && minutos >= 1) {
			System.out.println("O filme " + getTitulo() + " " + "possui " + hora + " " + "horas " + "e " + minutos + " "
					+ "minutos" + " " + "de duração");
		}

		else {
			System.out.println("O filme " + getTitulo() + " " + "possui " + hora + " " + "hora " + "e " + minutos + " "
					+ "minuto" + " " + "de duração");
		}

	}
	
	public void adicionaFilme(int id, String titulo, int duracaoEmMin) {
		Connection cn = ConexaoTeste.getConnection().Conn();
		try {
			PreparedStatement pStmt = cn.prepareStatement("insert into filme values (?, ?, ?)");
			pStmt.setInt(1, id);
			pStmt.setString(2, titulo);
			pStmt.setInt(3, duracaoEmMin);
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
	
	public void retornaFilme() {
		Connection cn = ConexaoTeste.getConnection().Conn();

		try {
			Statement st = cn.createStatement();
			st.executeQuery("Select * from filme");
			ResultSet rs = st.getResultSet();

			while (rs.next()) {
				System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
