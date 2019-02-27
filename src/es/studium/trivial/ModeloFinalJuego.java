package es.studium.trivial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ModeloFinalJuego {

	public void AltaJugador (String jugador, int puntuacion) throws ClassNotFoundException  {
		String driver = "com.mysql.jdbc.Driver";  
		String url = "jdbc:mysql://localhost:3306/juegotrivial?useSSL=false";  
		String login = "root";  
		String password = "Studium2018;"; 
		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.executeUpdate("INSERT INTO jugadores(nombreJugador, puntuacion)"
					+ " VALUES('"+jugador+"','"+puntuacion+"')");
		}
		catch(SQLException e) {
			System.out.println("Error en la sentencia SQL");
		}
	}

}
