package atividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	private static Connection conexao;

	public static Connection getConexao() {
		if (conexao == null) {
			try {
				String url = "jdbc:mysql://localhost/funcionario?autoReconnect=true&useSSL=false";
				String user = "root";
				String pass = "Xemgh!02";
				conexao = DriverManager.getConnection(url, user, pass);
				System.out.println("Connection successfully established! \n");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conexao;
	}
}
