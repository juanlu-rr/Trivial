package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorPregunta1 implements WindowListener,ActionListener
{
	VistaPregunta1 vistaPregunta1 = null;
	ModeloPregunta1 modeloPregunta1= null;
	int puntuacion = 0;
	String jugador;

	public ControladorPregunta1(ModeloPregunta1 m, VistaPregunta1 v, String j) 
	{
		this.vistaPregunta1 = v;
		this.modeloPregunta1 = m;
		this.jugador = j;

		vistaPregunta1.frame.addWindowListener(this);
		vistaPregunta1.respuesta2.addActionListener(this);
		vistaPregunta1.respuesta3.addActionListener(this);
		vistaPregunta1.btnSiguiente.addActionListener(this);
		vistaPregunta1.btnVolver.addActionListener(this);
		vistaPregunta1.btnComprobar.addActionListener(this);
		modeloPregunta1.sacarPregunta(v);	
	}

	public void comprobarRespuesta() {
		
		if (vistaPregunta1.respuesta1.isSelected() && vistaPregunta1.respuesta1.getText().equals(modeloPregunta1.respuestaCorrecta)) {	
			vistaPregunta1.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else if (vistaPregunta1.respuesta2.isSelected() && vistaPregunta1.respuesta2.getText().equals(modeloPregunta1.respuestaCorrecta)) {
			vistaPregunta1.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else  if (vistaPregunta1.respuesta3.isSelected() && vistaPregunta1.respuesta3.getText().equals(modeloPregunta1.respuestaCorrecta)) {
			vistaPregunta1.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else { 
			vistaPregunta1.lblComprueba.setText("La respuesta es incorrecta");
		}
		System.out.println(puntuacion);
	}

	public void actionPerformed(ActionEvent a) {
		Object objetoPulsado = a.getSource();
		if(objetoPulsado.equals(vistaPregunta1.btnComprobar)) {
			comprobarRespuesta();
			vistaPregunta1.btnComprobar.setEnabled(false);
		}
		else if (objetoPulsado.equals(vistaPregunta1.btnVolver)) {
			this.vistaPregunta1.frame.setVisible(false);
		} 
		else if (objetoPulsado.equals(vistaPregunta1.btnSiguiente)) {
			VistaPregunta2 vistaPregunta2 = new VistaPregunta2();
			ModeloPregunta2 modeloPregunta2 = new ModeloPregunta2();
			new ControladorPregunta2 (modeloPregunta2, vistaPregunta2, puntuacion, jugador);
			vistaPregunta1.frame.setVisible(false);
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
