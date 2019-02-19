package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorRanking implements WindowListener, ItemListener,ActionListener{
	VistaRanking vistaRanking = null;
	ModeloRanking modeloRanking= null;

	public ControladorRanking(ModeloRanking m, VistaRanking v) 
	{
		this.vistaRanking = v;
		this.modeloRanking = m;

		vistaRanking.btnVolverMenu.addActionListener(this);
		m.mostrarRanking(vistaRanking.rankingJugadores);
	}

	public void actionPerformed(ActionEvent a) {
		Object objetoPulsado = a.getSource();
		if (objetoPulsado.equals(vistaRanking.btnVolverMenu)) {
			vistaRanking.setVisible(false);
		}
	}

	public void itemStateChanged(ItemEvent arg0) {

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
