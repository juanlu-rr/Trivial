package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorMenuJuego implements ActionListener, WindowListener {
	ModeloMenuJuego ModeloMenuJuego = null;
	VistaMenuJuego VistaMenuJuego = null;
	VistaRanking10 VistaRanking10 = null;
	
	public ControladorMenuJuego(ModeloMenuJuego ModeloMenuJuego, VistaMenuJuego VistaMenuJuego) {
		this.ModeloMenuJuego = ModeloMenuJuego;
		this.VistaMenuJuego = VistaMenuJuego;
		
		VistaMenuJuego.frame.addWindowListener(this);
		VistaMenuJuego.btnNuevoJuego.addActionListener(this);
		//VistaMenuJuego.btnCrearPregunta.addActionListener(this);
		VistaMenuJuego.btnMostrarRanking.addActionListener(this);
	}

	public void windowActivated(WindowEvent e) {

	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {
		VistaMenuJuego.frame.setVisible(false);
	}

	public void windowDeactivated(WindowEvent e) {

	}

	public void windowDeiconified(WindowEvent e) {

	}

	public void windowIconified(WindowEvent e) {

	}

	public void windowOpened(WindowEvent e) {

	}

	public void actionPerformed(ActionEvent e) {
		Object objPulsado1 = e.getSource();
		if (objPulsado1.equals(VistaMenuJuego.btnNuevoJuego)) {
				ModeloJuegoPregunta mjp = new ModeloJuegoPregunta();
				VistaJuegoPregunta vjp = new VistaJuegoPregunta();
				new ControladorJuegoPregunta(mjp, vjp);
		}
		Object objetoPulsado2 = e.getSource();
		if (objetoPulsado2.equals(VistaMenuJuego.btnMostrarRanking)) {

			this.VistaRanking10 = new VistaRanking10();

			for (int i = 0; i < es.studium.trivial.ModeloMenuJuego.rankingJugadores().size(); i++) {
				VistaRanking10.rankingJugadores.add(es.studium.trivial.ModeloMenuJuego.rankingJugadores().get(i), VistaMenuJuego);
			}
		}
	}

}
