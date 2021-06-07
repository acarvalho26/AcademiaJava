package atividades;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class UpdateSample2 {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/sakila";
			String user = "root";
			String pass = "root";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");
			

			PreparedStatement pStmt = cn.prepareStatement("update actor set last_update=? where actor_id=?");

            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime()); 
            pStmt.setDate(1, startDate);			
			pStmt.setString(2,"1");
			
			//2 - Execute this query using executeUpdate()
			int rows =  pStmt.executeUpdate();
			cn.commit();	
			System.out.println(rows + " row(s)updated!");
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
}
