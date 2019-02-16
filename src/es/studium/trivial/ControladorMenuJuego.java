package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class ControladorMenuJuego implements ActionListener, WindowListener {
	ModeloMenuJuego mMenuJuego = null;
	VistaMenuJuego vMenuJuego = null;
	
	public ControladorMenuJuego(ModeloMenuJuego mmj, VistaMenuJuego vmj) {
		this.mMenuJuego = mmj;
		this.vMenuJuego = vmj;
		
		vMenuJuego.frame.addWindowListener(this);
		vMenuJuego.btnNuevoJuego.addActionListener(this);
		vMenuJuego.btnCrearPregunta.addActionListener(this);
		vMenuJuego.btnMostrarRanking.addActionListener(this);
		
	}

	public void windowActivated(WindowEvent e) {

	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {
		vMenuJuego.frame.setVisible(false);
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
		Object o = e.getSource();
		if (o.equals(vMenuJuego.btnNuevoJuego)) {
			{
				ModeloJuegoPregunta mjp = new ModeloJuegoPregunta();
				VistaJuegoPregunta vjp = new VistaJuegoPregunta();
				new ControladorJuegoPregunta(mjp, vjp);
			}
			
		}
	}

}
