package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class ControladorPrincipioJuego implements WindowListener,ActionListener
{
	VistaPrincipioJuego vistaPrincipioJuego = null;
	ModeloPrincipioJuego modeloPrincipioJuego= null;

	public ControladorPrincipioJuego(ModeloPrincipioJuego mpj, VistaPrincipioJuego vpj) {
		this.vistaPrincipioJuego = vpj;
		this.modeloPrincipioJuego = mpj;

		vistaPrincipioJuego.frame.addWindowListener(this);
		vistaPrincipioJuego.btnSiguiente.addActionListener(this);

	}
	



	public void actionPerformed(ActionEvent a)  {
		Object objetoPulsado = a.getSource();
		if (objetoPulsado.equals(vistaPrincipioJuego.btnSiguiente))  {
			ModeloPregunta1 mp1 = new ModeloPregunta1();
			VistaPregunta1 vp1 = new VistaPregunta1();
			new ControladorPregunta1(mp1, vp1);
		} 
		try {
			modeloPrincipioJuego.AltaJugador(vistaPrincipioJuego.txtNombre.getText(), 0);
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		vistaPrincipioJuego.frame.setVisible(false);

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
