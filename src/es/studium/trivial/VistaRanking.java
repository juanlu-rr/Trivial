package es.studium.trivial;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;

public class VistaRanking extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	JButton btnVolverMenu;
	JList<String> rankingJugadores;


	public VistaRanking() {
		getContentPane().setBackground(Color.BLUE);
		initialize();
	}

	private void initialize() 
	{
		this.setBounds(100, 100, 739, 489);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		rankingJugadores = new JList<String>(new DefaultListModel<String>());
		
		JLabel lblJuego = new JLabel("Juego de Preguntas");
		lblJuego.setHorizontalAlignment(SwingConstants.CENTER);
		lblJuego.setForeground(Color.YELLOW);
		lblJuego.setFont(new Font("Snap ITC", Font.BOLD, 26));
		lblJuego.setBackground(new Color(102, 205, 170));
		
		btnVolverMenu = new JButton("Volver al Men\u00FA");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(91)
							.addComponent(rankingJugadores, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblJuego, GroupLayout.PREFERRED_SIZE, 709, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(266)
							.addComponent(btnVolverMenu, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblJuego, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(rankingJugadores, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnVolverMenu, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(39))
		);
		
		getContentPane().setLayout(groupLayout);
		this.setVisible(true);
	}
}
