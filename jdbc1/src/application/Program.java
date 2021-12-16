package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		Statement st = null; // variavel utilizada para buscar o conteúdo do banco
		ResultSet rs = null; // utilizado para salvar o conteúdo
		PreparedStatement ps = null;
		
		//Faz a leitura do banco de dados
		
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement(); // instancia um objeto do tipo statement
			
			rs = st.executeQuery("select * from department");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
			System.out.println();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Faz a inserção de dados no banco de dados
		
		try {
			conn = DB.getConnection();
			
			ps = conn.prepareStatement(
					"INSERT INTO seller "
							+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
							+ "VALUES "
							+ "(?, ?, ?, ?, ?)", //deixa em espera os valores a serem preenchidos 
							Statement.RETURN_GENERATED_KEYS
					);
			
			// Substitui esses valores nos "?" acima
			ps.setString(1, "Carl Puerple");
			ps.setString(2, "carl@gmail.com");
			ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			ps.setDouble(4, 2000.00);
			ps.setInt(5, 4);
			
			int rowsAffected =  ps.executeUpdate();
			
			if (rowsAffected > 0) {
				rs = ps.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
					System.out.println();
				}
			}
			else {
				System.out.println("No rows affected!");
			}
			
			rs = st.executeQuery("select * from seller");
			
			while (rs.next()) {
				System.out.println(
						rs.getInt("Id") 
							+ ", " + rs.getString("Name")
							+ ", " + rs.getString("Email")
							+ ", " + rs.getDate("BirthDate")
							+ ", " + rs.getDouble("BaseSalary")
							+ ", " + rs.getInt("DepartmentId")
						);
			}
			System.out.println();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}
}
