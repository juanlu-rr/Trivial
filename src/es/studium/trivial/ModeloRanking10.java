package es.studium.trivial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

public class ModeloRanking10 {
	
	public JList<String> mostrarRanking (JList<String> rankingJugadores) {

		// Conectar a la base de datos para comprobar credenciales
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/juegotrivial";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "SELECT * FROM jugadores";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		List<String> mostrarRanking = new ArrayList<>();

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			rs = statement.executeQuery(sentencia);

			while (rs.next()) {
				mostrarRanking.add("Nombre: " + rs.getString("nombreJugador") + " - " +" Puntos: " + rs.getString("puntuacion"));
			}
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
		return rankingJugadores;
	}
}
