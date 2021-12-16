package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null; // variavel utilizada para buscar o conteúdo do banco
		ResultSet rs = null; // utilizado para salvar o conteúdo
		

		try {
			conn = DB.getConnection();
			
			st = conn.createStatement(); // instancia um objeto do tipo statement
			
			rs = st.executeQuery("select * from department");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
