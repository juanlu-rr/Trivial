package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorRanking10 implements WindowListener, ItemListener,ActionListener{
	VistaRanking10 vistaRanking10 = null;
	ModeloRanking10 modeloRanking10= null;

	public ControladorRanking10(ModeloRanking10 m, VistaRanking10 v) {
		this.vistaRanking10 = v;
		this.modeloRanking10 = m;

		v.btnVolverMenu.addActionListener(this);
		System.out.println("Probando");
		m.mostrarRanking(vistaRanking10.rankingJugadores);
	}

	public void actionPerformed(ActionEvent a) {
		Object objetoPulsado = a.getSource();
		if (objetoPulsado.equals(vistaRanking10.btnVolverMenu)) {
			vistaRanking10.setVisible(false);
		}
	}

	public void itemStateChanged(ItemEvent arg0) {

	}

	public void windowActivated(WindowEvent e) {

	}

	public void windowClosed(WindowEvent e) {
		
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
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
