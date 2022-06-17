package Conexao_BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private static final String dURL = "jdbc:mysql://localhost:3306/bd_locadora";
	private static final String USER = "root";
	private static final String PASS = "admin";
	
	public static Connection getcConnection() {
		try {
			Connection c = DriverManager.getConnection(dURL, USER, PASS);
			return c;
		} catch (Exception e) {
			return null;
		}
	}
	

}