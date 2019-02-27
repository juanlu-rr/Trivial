package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorPregunta5 implements WindowListener,ActionListener
{
	VistaPregunta5 vistaPregunta5 = null;
	ModeloPregunta5 modeloPregunta5= null;
	int puntuacion;
	String jugador;

	public ControladorPregunta5(ModeloPregunta5 m, VistaPregunta5 v, int p, String j) 
	{
		this.vistaPregunta5 = v;
		this.modeloPregunta5 = m;
		this.puntuacion = p;
		this.jugador = j;

		vistaPregunta5.frame.addWindowListener(this);
		vistaPregunta5.respuesta2.addActionListener(this);
		vistaPregunta5.respuesta3.addActionListener(this);
		vistaPregunta5.btnSiguiente.addActionListener(this);
		vistaPregunta5.btnComprobar.addActionListener(this);
		modeloPregunta5.sacarPregunta(v);	
	}

	public void comprobarRespuesta() {
		
		if (vistaPregunta5.respuesta1.isSelected() && vistaPregunta5.respuesta1.getText().equals(modeloPregunta5.respuestaCorrecta)) {	
			vistaPregunta5.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else if (vistaPregunta5.respuesta2.isSelected() && vistaPregunta5.respuesta2.getText().equals(modeloPregunta5.respuestaCorrecta)) {
			vistaPregunta5.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else  if (vistaPregunta5.respuesta3.isSelected() && vistaPregunta5.respuesta3.getText().equals(modeloPregunta5.respuestaCorrecta)) {
			vistaPregunta5.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else { 
			vistaPregunta5.lblComprueba.setText("La respuesta es incorrecta");
		}	
		System.out.println(puntuacion);
	}

	public void actionPerformed(ActionEvent a) {
		Object objetoPulsado = a.getSource();
		if(objetoPulsado.equals(vistaPregunta5.btnComprobar)) {
			comprobarRespuesta();
			vistaPregunta5.btnComprobar.setEnabled(false);
		}
		else if (objetoPulsado.equals(vistaPregunta5.btnSiguiente)) {
			VistaFinalJuego vistaFinalJuego = new VistaFinalJuego();
			ModeloFinalJuego modeloFinalJuego = new ModeloFinalJuego();
			new ControladorFinalJuego (modeloFinalJuego, vistaFinalJuego, puntuacion, jugador);
			vistaPregunta5.frame.setVisible(false);
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
