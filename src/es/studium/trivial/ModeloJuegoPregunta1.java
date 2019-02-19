package es.studium.trivial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Random;

import com.itextpdf.text.Document;

import es.studium.ProgramaGestión.ModeloLogin;
import es.studium.ProgramaGestión.VistaLogin;

public class ModeloJuegoPregunta1 {

	private static final long serialVersionUID = 1L;
	String driver = "com.mysql.jdbc.Driver";  
	String url = "jdbc:mysql://localhost:3306/juegotrivial";  
	String login = "root";  
	String password = "Studium2018;"; 
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;


	public void rellenarPregunta() throws ParseException {
		
		int preguntaAleatoria;
		String sentencia = "Select * FROM preguntas WHERE idPregunta = '"+preguntaAleatoria;
		 sentencia2 = "Select * FROM preguntas WHERE repetida = 1";
		
		Random rand = new Random();
		preguntaAleatoria = rand.nextInt(21);
		if (preguntaAleatoria = sentencia2) {
			
		}
		

		Class.forName(driver);
		connection = DriverManager.getConnection(url, login, password);
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		rs = statement.executeQuery(sentencia);



	} catch (ClassNotFoundException cnfe) {
		System.out.println("Error 1-" + cnfe.getMessage());
	} catch (SQLException sqle) {
		System.out.println("Error 2-" + sqle.getMessage());
	} finally 
	{
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			System.out.println("Error 3-" + e.getMessage());
		}
	}
}
