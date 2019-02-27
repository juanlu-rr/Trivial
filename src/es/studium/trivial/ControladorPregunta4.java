package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorPregunta4 implements WindowListener,ActionListener
{
	VistaPregunta4 vistaPregunta4 = null;
	ModeloPregunta4 modeloPregunta4= null;
	int puntuacion;
	String jugador;


	public ControladorPregunta4(ModeloPregunta4 m, VistaPregunta4 v, int p, String jugador) 
	{
		this.vistaPregunta4 = v;
		this.modeloPregunta4 = m;
		this.puntuacion = p;
		this.jugador = jugador;

		vistaPregunta4.frame.addWindowListener(this);
		vistaPregunta4.respuesta2.addActionListener(this);
		vistaPregunta4.respuesta3.addActionListener(this);
		vistaPregunta4.btnSiguiente.addActionListener(this);
		vistaPregunta4.btnComprobar.addActionListener(this);
		modeloPregunta4.sacarPregunta(v);	
	}

	public void comprobarRespuesta() {
		
		if (vistaPregunta4.respuesta1.isSelected() && vistaPregunta4.respuesta1.getText().equals(modeloPregunta4.respuestaCorrecta)) {	
			vistaPregunta4.lblComprueba.setText("La respuesta es correcta");	
			puntuacion++;
		} else if (vistaPregunta4.respuesta2.isSelected() && vistaPregunta4.respuesta2.getText().equals(modeloPregunta4.respuestaCorrecta)) {
			vistaPregunta4.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else  if (vistaPregunta4.respuesta3.isSelected() && vistaPregunta4.respuesta3.getText().equals(modeloPregunta4.respuestaCorrecta)) {
			vistaPregunta4.lblComprueba.setText("La respuesta es correcta");
			puntuacion++;
		} else { 
			vistaPregunta4.lblComprueba.setText("La respuesta es incorrecta");
		}		
		System.out.println(puntuacion);
	}

	public void actionPerformed(ActionEvent a) {
		Object objetoPulsado = a.getSource();
		if(objetoPulsado.equals(vistaPregunta4.btnComprobar)) {
			comprobarRespuesta();
			vistaPregunta4.btnComprobar.setEnabled(false);
		}
		else if (objetoPulsado.equals(vistaPregunta4.btnSiguiente)) {
			VistaPregunta5 vistaPregunta5 = new VistaPregunta5();
			ModeloPregunta5 modeloPregunta5 = new ModeloPregunta5();
			new ControladorPregunta5 (modeloPregunta5, vistaPregunta5, puntuacion, jugador);
			vistaPregunta4.frame.setVisible(false);
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
