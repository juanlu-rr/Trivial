package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorMenuJuego implements ActionListener, WindowListener {
	
	VistaMenuJuego VistaMenuJuego = null;
	ModeloMenuJuego ModeloMenuJuego = null;
	VistaRanking10 VistaRanking10 = null;

	public ControladorMenuJuego(ModeloMenuJuego ModeloMenuJuego, VistaMenuJuego VistaMenuJuego) {
		this.ModeloMenuJuego = ModeloMenuJuego;
		this.VistaMenuJuego = VistaMenuJuego;

		VistaMenuJuego.addWindowListener(this);
		VistaMenuJuego.btnNuevoJuego.addActionListener(this);
		VistaMenuJuego.btnMostrarRanking.addActionListener(this);
	}

	public void windowActivated(WindowEvent e) {

	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {
		VistaMenuJuego.setVisible(false);
	}

	public void windowDeactivated(WindowEvent e) {

	}

	public void windowDeiconified(WindowEvent e) {

	}

	public void windowIconified(WindowEvent e) {

	}

	public void windowOpened(WindowEvent e) {

	}

	public void actionPerformed(ActionEvent ae) {
		Object objetoPulsado;
		objetoPulsado = ae.getSource();
		if (objetoPulsado.equals(VistaMenuJuego.btnNuevoJuego)) {
			ModeloJuegoPregunta1 mjp = new ModeloJuegoPregunta1();
			VistaJuegoPregunta1 vjp = new VistaJuegoPregunta1();
			new ControladorJuegoPregunta1(mjp, vjp);
		} else if (objetoPulsado.equals(VistaMenuJuego.btnMostrarRanking)) {
			VistaRanking10 vistaRanking = new VistaRanking10();
			ModeloRanking10 modeloRanking = new ModeloRanking10();
			new ControladorRanking10 (modeloRanking, vistaRanking);
		}
	}
}
