package atividades;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoTeste {

	private String caminho = "localhost";
	private String porta = "3306";
//	\/ AQUI � NECESS�RIO MUDAR O NOME DO SCHEMA QUE VOC� VAI QUERER ACESSAR / ADICIONAR \/
	private String nome = "filme";
	private String usuario = "root";
	private String senha = "Xemgh!02";

	private String URL = "jdbc:mysql://" + caminho + ":" + porta + "/" + nome + "?autoReconnect=true&useSSL=false";

	@SuppressWarnings("unused")
	public static ConexaoTeste getConnection() {

		ConexaoTeste conexaoteste = null;
		if (conexaoteste == null) {

			conexaoteste = new ConexaoTeste();
			return conexaoteste;

		} else {
			return null;
		}
	}

	public Connection Conn() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(URL, usuario, senha);
			System.out.println("conex�o estabelecida");
			return cn;

		} catch (Exception e) {
			System.err.println(e.getMessage());

		}

		return null;

	}
}
