package es.studium.trivial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ModeloRanking 
{
	public ModeloRanking() 
	{}
	
	public JList<String> mostrarRanking (JList<String> rankingJugadores) {

		// Conectar a la base de datos para comprobar credenciales
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/juegotrivial?useSSL=false";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "SELECT * FROM jugadores ORDER BY puntuacion DESC LIMIT 10";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			rs = statement.executeQuery(sentencia);

			while (rs.next()) {
				((DefaultListModel<String>)rankingJugadores.getModel()).addElement("Nombre: " + rs.getString("nombreJugador") + " - " +" Puntos: " + rs.getString("puntuacion"));
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
