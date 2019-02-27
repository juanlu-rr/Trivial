package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorMenuJuego implements ActionListener, WindowListener {
	
	VistaMenuJuego vistaMenuJuego = null;
	VistaRanking vistaRanking = null;
	ModeloMenuJuego modeloMenuJuego = null;

	public ControladorMenuJuego(ModeloMenuJuego m, VistaMenuJuego v) {
		this.modeloMenuJuego = m;
		this.vistaMenuJuego = v;

		vistaMenuJuego.addWindowListener(this);
		vistaMenuJuego.btnNuevoJuego.addActionListener(this);
		vistaMenuJuego.btnMostrarRanking.addActionListener(this);
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
		if (objetoPulsado.equals(vistaMenuJuego.btnNuevoJuego)) 
		{
			VistaPrincipioJuego vpj = new VistaPrincipioJuego();
			ModeloPrincipioJuego mpj = new ModeloPrincipioJuego();
			new ControladorPrincipioJuego(mpj, vpj);
			System.out.println("Juego Nuevo iniciado");
		} 
		else if (objetoPulsado.equals(vistaMenuJuego.btnMostrarRanking)) 
		{
			VistaRanking vistaRanking = new VistaRanking();
			ModeloRanking modeloRanking = new ModeloRanking();
			new ControladorRanking (modeloRanking, vistaRanking);
		}
	}
}
