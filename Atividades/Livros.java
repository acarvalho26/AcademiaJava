package atividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Livros {

	private String titulo;

	private int qtdPaginas;

	private int paginasLidas;

	public Livros(String titulo, int qtdPaginas, int paginasLidas) {

		this.titulo = titulo;
		this.qtdPaginas = qtdPaginas;
		this.paginasLidas = paginasLidas;

	}

	public Livros() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public int getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}

	public void verificarProgresso() {

		int porcentagem;

		porcentagem = (getPaginasLidas() * 100) / getQtdPaginas();

		System.out.println("Você já leu: " + porcentagem + "%" + " " + "do livro");

	}

	public void adicionaLivro(int id, String titulo, int qtdPaginas, int paginasLidas) {
		Connection cn = ConexaoTeste.getConnection().Conn();
		try {
			PreparedStatement pStmt = cn.prepareStatement("insert into livro values (?, ?, ? ,?)");
			pStmt.setInt(1, id);
			pStmt.setString(2, titulo);
			pStmt.setInt(3, qtdPaginas);
			pStmt.setInt(4, paginasLidas);
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
	
	public void retornaLivro() {
		Connection cn = ConexaoTeste.getConnection().Conn();

		try {
			Statement st = cn.createStatement();
			st.executeQuery("Select * from livro");
			ResultSet rs = st.getResultSet();

			while (rs.next()) {
				System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - "
						+ rs.getString(4));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
