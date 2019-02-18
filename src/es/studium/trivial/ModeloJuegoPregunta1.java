package es.studium.trivial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

public class ModeloJuegoPregunta1 {
	public void rellenarPregunta() throws ParseException  {

		String driver = "com.mysql.jdbc.Driver";  
		String url = "jdbc:mysql://localhost:3306/juegotrivial";  
		String login = "root";  
		String password = "Studium2018;"; 
		String sentencia = "SELECT * FROM preguntas;"; 
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		System.out.println(sentencia);
		try {

			Class.forName(driver);
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			rs = statement.executeQuery(sentencia);
			rs.next();
			//VistaJuegoPregunta.pregunta1.setText(rs.getString("pregunta"));

		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error 1-" + cnfe.getMessage());
		} catch (SQLException sqle) {
			System.out.println("Error 2-" + sqle.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("Error 3-" + e.getMessage());
			}
		}
	}
	
}
