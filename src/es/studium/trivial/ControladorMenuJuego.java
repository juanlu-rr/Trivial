package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorMenuJuego implements ActionListener, WindowListener {
	
	VistaMenuJuego VistaMenuJuego = null;
	ModeloMenuJuego ModeloMenuJuego = null;
	VistaRanking VistaRanking = null;

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
		if (objetoPulsado.equals(VistaMenuJuego.btnNuevoJuego)) 
		{
			ModeloPregunta1 mjp = new ModeloPregunta1();
			VistaPregunta1 vjp = new VistaPregunta1();
			new ControladorPregunta1(mjp, vjp);
		} 
		else if (objetoPulsado.equals(VistaMenuJuego.btnMostrarRanking)) 
		{
			VistaRanking vistaRanking = new VistaRanking();
			ModeloRanking modeloRanking = new ModeloRanking();
			new ControladorRanking (modeloRanking, vistaRanking);
		}
	}
}
