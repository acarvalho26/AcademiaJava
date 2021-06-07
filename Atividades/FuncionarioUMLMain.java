package atividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioUMLMain {

	public static void main(String[] args) {

		try {

//			Estou usando esse "?autoReconnect=true&useSSL=false" porque sem ele o eclipse acusa um AVISO dizendo que estabelecer a conexão SSL sem a verificação do server
//			não é recomendada etc. Caso dê algum erro na sua parte é só remover e executar
			String url = "jdbc:mysql://localhost/funcionario?autoReconnect=true&useSSL=false";
			String user = "root";
//			coloquei a senha padrão por motivos de segurança
			String pass = "Xemgh!02";

			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");

			PreparedStatement pStmt = cn.prepareStatement("insert into funcionario values (?, ?, ? ,? ,?)");

//			Se o senhor tentar rodar o programa de novo com o mesmo valor no primeiro setString, ele vai acusar a chave duplicada e não vai adicionar
			pStmt.setString(1, "2551");
			pStmt.setString(2, "Joao");
			pStmt.setDouble(3, 2000);
			pStmt.setString(4, "111111");
			pStmt.setString(5, "01/04/2019");

			int rows = pStmt.executeUpdate();

			cn.commit();

			System.out.println(rows + " COLUNAS ADICIONADAS ");

			pStmt.executeQuery("Select * from funcionario ");

			ResultSet rs = pStmt.getResultSet();

			while (rs.next()) {

				System.out.println(rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - "
						+ rs.getString(4) + " - " + rs.getString(5));
			}

			cn.close();

		}

		catch (SQLException e) {
			if (e.getErrorCode() == 1062) {

				System.out.println("chave duplicada");
			}

		} catch (Exception e) {

			System.out.println(e);
		}

	}

	static void adicionaFunc(String nome, int matricula, double salario, String dataAdmissao, long cpf) {
		Connection cn = FabricaConexao.getConexao();

		try {

			PreparedStatement pStmt = cn.prepareStatement("insert into funcionario values (?, ?, ? ,? ,?)");
			pStmt.setString(1, "25516");
			pStmt.setString(2, "Joao");
			pStmt.setDouble(3, 2000);
			pStmt.setString(4, "111111");
			pStmt.setString(5, "01/04/2019");
			pStmt.executeUpdate();
			cn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
