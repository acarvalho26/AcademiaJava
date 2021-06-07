package atividades;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrincipalFabricaConexao {

	private static Connection conexao; 
	
	public static void main(String[] args) {
		conexao = FabricaConexao.getConexao();
		incluirAutor();
		fecharConexao();
	}
	
	static void incluirAutor() {
		String sql = "insert into autores(id, nome) values (?,?)";
		try {
			PreparedStatement pst = conexao.prepareStatement(sql);
			pst.setInt(1, 2);
			pst.setString(2, "JULIO VERNE");
			
			pst.execute(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	static void fecharConexao() {
		try {
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
