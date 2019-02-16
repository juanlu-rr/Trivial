package es.studium.trivial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ModeloMenuJuego {
	public List<String> rankingJugadores() {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/juegotrivial";
		String login = "root";
		String password = "Studium2018;";
		String sentencia = "SELECT * FROM jugadores WHERE puntuacion in (SELECT DISTINCT TOP 5 puntuacion FROM jugadores ORDER BY puntuacion DESC)";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		List<String> rankingJugadores = new ArrayList<>();
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement();
			rs = statement.executeQuery(sentencia);while (rs.next()) {
				rankingJugadores.add("Jugador: " + rs.getString("nombreJugador") + "   " +"Preguntas acertadas: " + rs.getString("puntuacion"));
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
	public boolean jugadorNuevo(String txfNombre) throws ParseException {
		boolean conexion = false;
		String driver = "com.mysql.jdbc.Driver";  
		String url = "jdbc:mysql://localhost:3306/juegotrivial";  
		String login = "root";  
		String password = "Studium2018;";  
		//TODO crear el txtNombre donde pido el nombre de usuario
		String sentencia = "INSERT INTO jugadores(idJugador, nombreJugador) values "+"("+null+",'"+ txfNombre+"')";   
		Connection connection = null; 
		Statement  statement = null; 
		System.out.println(sentencia);
   
		try {   
			Class.forName(driver);     
			connection = DriverManager.getConnection(url, login, password);        
			statement = connection.createStatement();   
			statement.executeUpdate(sentencia);   
		} 
		catch (ClassNotFoundException cnfe) {    
			System.out.println("Error 1-"+cnfe.getMessage());   
		}  
		catch (SQLException sqle) {     
			System.out.println("Error 2-"+sqle.getMessage());  
		} 
		finally {     
			try {           
				if(connection!=null) {           
					connection.close();      
				}       
			}       
			catch (SQLException e) {      
				System.out.println("Error 3-"+e.getMessage());    
			}  
		} 
		return (conexion);
	}

}
