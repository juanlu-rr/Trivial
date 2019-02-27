package es.studium.trivial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class ModeloPregunta3 {
	String pregunta;
	String respuestaCorrecta;
	String respuestaIncorrecta1;
	String respuestaIncorrecta2;
	int ya;

	public void sacarPregunta (VistaPregunta3 VistaPregunta3)  {
		String driver = "com.mysql.jdbc.Driver";  
		String url = "jdbc:mysql://localhost:3306/juegotrivial?useSSL=false";  
		String login = "root";  
		String password = "Studium2018;"; 
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;


		Random rand = new Random();
		int preguntaAleatoria = rand.nextInt(21)+1;
		String sentencia = "Select * FROM preguntas WHERE idPregunta =" + preguntaAleatoria + " AND ya = 0";
		//String update = "Update preguntas SET ya = 1 WHERE idPregunta ="+ preguntaAleatoria ;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, login, password);
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = statement.executeQuery(sentencia);
			rs.next();
			pregunta = rs.getString("pregunta");
			respuestaCorrecta = rs.getString("respuestaCorrecta");
			respuestaIncorrecta1 = rs.getString("respuestaIncorrecta1");
			respuestaIncorrecta2 = rs.getString("respuestaIncorrecta2");

			VistaPregunta3.pregunta1.setText(pregunta);
			Random rand2 = new Random();
			int i = rand2.nextInt(5);
			if (i==0) { VistaPregunta3.respuesta1.setText(respuestaCorrecta); VistaPregunta3.respuesta2.setText(respuestaIncorrecta1); 
			VistaPregunta3.respuesta3.setText(respuestaIncorrecta2);
			} else if (i==1) { VistaPregunta3.respuesta1.setText(respuestaCorrecta); VistaPregunta3.respuesta2.setText(respuestaIncorrecta2);
			VistaPregunta3.respuesta3.setText(respuestaIncorrecta1);
			} else if (i==2) { VistaPregunta3.respuesta1.setText(respuestaIncorrecta1); VistaPregunta3.respuesta2.setText(respuestaCorrecta);
			VistaPregunta3.respuesta3.setText(respuestaIncorrecta2);
			}else if (i==3) { VistaPregunta3.respuesta1.setText(respuestaIncorrecta1); VistaPregunta3.respuesta2.setText(respuestaIncorrecta2);
			VistaPregunta3.respuesta3.setText(respuestaCorrecta);
			}else if (i==4) { VistaPregunta3.respuesta1.setText(respuestaIncorrecta2); VistaPregunta3.respuesta2.setText(respuestaCorrecta);
			VistaPregunta3.respuesta3.setText(respuestaIncorrecta1);
			}else if (i==5) { VistaPregunta3.respuesta1.setText(respuestaIncorrecta2); VistaPregunta3.respuesta2.setText(respuestaIncorrecta1);
			VistaPregunta3.respuesta3.setText(respuestaCorrecta);
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error 1-" + cnfe.getMessage());
		} catch (SQLException sqle) {
			System.out.println("Error 2-" + sqle.getMessage());
			System.out.println(sqle);
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("Error 3-" + e.getMessage());
			}
		}
		
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, login, password);
//			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//			rs = statement.executeQuery(update);
//			rs.next();
//			ya = rs.getInt("ya");
//
//		} catch (ClassNotFoundException cnfe) {
//			System.out.println("Error 1-" + cnfe.getMessage());
//		} catch (SQLException sqle) {
//			System.out.println("Error 2-" + sqle.getMessage());
//		} finally {
//			try {
//				if (connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				System.out.println("Error 3-" + e.getMessage());
//			}
//		}
	}

	public int aumentarPuntuacion(int puntuacion) {
		return puntuacion+1;
	}

}
