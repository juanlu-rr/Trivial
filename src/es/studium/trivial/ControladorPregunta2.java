package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorPregunta2 implements WindowListener,ActionListener
{
	VistaPregunta2 vistaPregunta2 = null;
	ModeloPregunta2 modeloPregunta2= null;
	int puntuacion;
	String jugador;
	

	public ControladorPregunta2(ModeloPregunta2 m, VistaPregunta2 v, int p, String jugador) 
	{
		this.vistaPregunta2 = v;
		this.modeloPregunta2 = m;
		this.puntuacion = p;
		this.jugador = jugador;

		vistaPregunta2.frame.addWindowListener(this);
		vistaPregunta2.respuesta2.addActionListener(this);
		vistaPregunta2.respuesta3.addActionListener(this);
		vistaPregunta2.btnSiguiente.addActionListener(this);
		vistaPregunta2.btnComprobar.addActionListener(this);
		modeloPregunta2.sacarPregunta(v);	
	}

	public void comprobarRespuesta() {
		
		if (vistaPregunta2.respuesta1.isSelected() && vistaPregunta2.respuesta1.getText().equals(modeloPregunta2.respuestaCorrecta)) {	
			vistaPregunta2.lblComprueba.setText("La respuesta es correcta");	
			puntuacion++;
		} else if (vistaPregunta2.respuesta2.isSelected() && vistaPregunta2.respuesta2.getText().equals(modeloPregunta2.respuestaCorrecta)) {
			vistaPregunta2.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else  if (vistaPregunta2.respuesta3.isSelected() && vistaPregunta2.respuesta3.getText().equals(modeloPregunta2.respuestaCorrecta)) {
			vistaPregunta2.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else { 
			vistaPregunta2.lblComprueba.setText("La respuesta es incorrecta");
		}	
		System.out.println(puntuacion);
	}

	public void actionPerformed(ActionEvent a) {
		Object objetoPulsado = a.getSource();
		if(objetoPulsado.equals(vistaPregunta2.btnComprobar)) {
			comprobarRespuesta();
			vistaPregunta2.btnComprobar.setEnabled(false);
		}
		else if (objetoPulsado.equals(vistaPregunta2.btnSiguiente)) {
			VistaPregunta3 vistaPregunta3 = new VistaPregunta3();
			ModeloPregunta3 modeloPregunta3 = new ModeloPregunta3();
			new ControladorPregunta3 (modeloPregunta3, vistaPregunta3, puntuacion, jugador);
			vistaPregunta2.frame.setVisible(false);
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
