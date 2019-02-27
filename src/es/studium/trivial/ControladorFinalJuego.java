package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class ControladorFinalJuego implements WindowListener, ItemListener,ActionListener
{
	VistaFinalJuego vistaFinalJuego = null;
	ModeloFinalJuego modeloFinalJuego= null;
	int puntuacion;
	String jugador;

	public ControladorFinalJuego(ModeloFinalJuego modeloFinalJuego, VistaFinalJuego vistaFinalJuego, int p, String j) 
	{
		this.vistaFinalJuego = vistaFinalJuego;
		this.modeloFinalJuego = modeloFinalJuego;
		this.puntuacion = p;
		this.jugador = j;

		try {
			modeloFinalJuego.AltaJugador(jugador, puntuacion);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		vistaFinalJuego.puntuacionTotal.setText(Integer.toString(puntuacion) + " puntos");

	}

	public void actionPerformed(ActionEvent a) {

	}

	public void itemStateChanged(ItemEvent e) {

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
