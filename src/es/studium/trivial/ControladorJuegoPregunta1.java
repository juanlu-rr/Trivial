package es.studium.trivial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.ParseException;

public class ControladorJuegoPregunta1 implements WindowListener, ItemListener,ActionListener{
	VistaJuegoPregunta1 VistaJuegoPregunta1 = null;
	ModeloJuegoPregunta1 ModeloJuegoPregunta1= null;

	public ControladorJuegoPregunta1(ModeloJuegoPregunta1 ModeloJuegoPregunta1, VistaJuegoPregunta1 VistaJuegoPregunta1) {
		this.VistaJuegoPregunta1 = VistaJuegoPregunta1;
		this.ModeloJuegoPregunta1 = ModeloJuegoPregunta1;
		
		VistaJuegoPregunta1.addWindowListener(this);
		try {
			ModeloJuegoPregunta1.rellenarPregunta();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		VistaJuegoPregunta1.respuesta1.addItemListener(this); 
		VistaJuegoPregunta1.respuesta2.addActionListener(this);
		VistaJuegoPregunta1.respuesta3.addActionListener(this);
		VistaJuegoPregunta1.btnSiguiente.addActionListener(this);

	}

	public void actionPerformed(ActionEvent arg0) {
		
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
