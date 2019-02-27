            package es.studium.trivial;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorPregunta3 implements WindowListener,ActionListener
{
	VistaPregunta3 vistaPregunta3 = null;
	ModeloPregunta3 modeloPregunta3= null;
	int puntuacion;
	String jugador;

	public ControladorPregunta3(ModeloPregunta3 m, VistaPregunta3 v, int p, String jugador) 
	{
		this.vistaPregunta3 = v;
		this.modeloPregunta3 = m;
		this.puntuacion = p;
		this.jugador = jugador;

		vistaPregunta3.frame.addWindowListener(this);
		vistaPregunta3.respuesta2.addActionListener(this);
		vistaPregunta3.respuesta3.addActionListener(this);
		vistaPregunta3.btnSiguiente.addActionListener(this);
		vistaPregunta3.btnComprobar.addActionListener(this);
		modeloPregunta3.sacarPregunta(v);	
	}

	public void comprobarRespuesta() {
		
		if (vistaPregunta3.respuesta1.isSelected() && vistaPregunta3.respuesta1.getText().equals(modeloPregunta3.respuestaCorrecta)) {	
			vistaPregunta3.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else if (vistaPregunta3.respuesta2.isSelected() && vistaPregunta3.respuesta2.getText().equals(modeloPregunta3.respuestaCorrecta)) {
			vistaPregunta3.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else  if (vistaPregunta3.respuesta3.isSelected() && vistaPregunta3.respuesta3.getText().equals(modeloPregunta3.respuestaCorrecta)) {
			vistaPregunta3.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else { 
			vistaPregunta3.lblComprueba.setText("La respuesta es incorrecta");
		}		
		System.out.println(puntuacion);
	}

	public void actionPerformed(ActionEvent a) {
		Object objetoPulsado = a.getSource();
		if(objetoPulsado.equals(vistaPregunta3.btnComprobar)) {
			comprobarRespuesta();
			vistaPregunta3.btnComprobar.setEnabled(false);
		}
		else if (objetoPulsado.equals(vistaPregunta3.btnSiguiente)) {
			VistaPregunta4 vistaPregunta4 = new VistaPregunta4();
			ModeloPregunta4 modeloPregunta4 = new ModeloPregunta4();
			new ControladorPregunta4 (modeloPregunta4, vistaPregunta4, puntuacion, jugador);
			vistaPregunta3.frame.setVisible(false);
		}
	}

	public void windowActivated(WindowEvent e) {

	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {

	}

	public void windowDeactivated(WindowEvent e) {

	}

	public void windowDeiconified(WindowEvent e) {

	}

	public void windowIconified(WindowEvent e) {

	}

	public void windowOpened(WindowEvent e) {

	}


}
