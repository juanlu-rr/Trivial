package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.sql.SQLException;


public class ControladorFinalJuego implements WindowListener, ItemListener,ActionListener
{
	VistaFinalJuego vistaFinalJuego = null;
	ModeloFinalJuego modeloFinalJuego= null;

	public ControladorFinalJuego(ModeloFinalJuego modeloFinalJuego, VistaFinalJuego vistaFinalJuego) 
	{
		this.vistaFinalJuego = vistaFinalJuego;
		this.modeloFinalJuego = modeloFinalJuego;
		
		
		vistaFinalJuego.btnFinalizar.addItemListener(this); 
		


	}

	public void actionPerformed(ActionEvent a) {
		Object objetoPulsado = a.getSource();
		if (objetoPulsado.equals(vistaFinalJuego.btnFinalizar)) {
			try {
				modeloFinalJuego.altaJugador(vistaFinalJuego.txtNombre.getText(),vistaFinalJuego.puntuacionTotal.getText());
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
			try {
				modeloFinalJuego.registrarJugador("INSERT INTO jugadores VALUES" + " ("+vistaFinalJuego.txtNombre.getText(),vistaFinalJuego.puntuacionTotal.getText()+")");
			} catch (ClassNotFoundException | SQLException e2) {
				e2.printStackTrace();
			}
			try {
				modeloFinalJuego.puntuacionTotal(vistaFinalJuego.puntuacionTotal);
			} catch (ClassNotFoundException | SQLException e3) {
				e3.printStackTrace();
			}

			vistaFinalJuego.setVisible(false);
		
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
