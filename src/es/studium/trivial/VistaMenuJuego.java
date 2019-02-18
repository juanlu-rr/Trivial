package es.studium.trivial;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaMenuJuego extends JFrame{

	private static final long serialVersionUID = 1L;
	JFrame frame;
	JButton btnNuevoJuego;
	JButton btnCrearPregunta;
	JButton btnMostrarRanking;


	public VistaMenuJuego() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 139));
		frame.setBounds(100, 100, 350, 352);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnNuevoJuego = new JButton("Nuevo Juego");
		btnNuevoJuego.setForeground(new Color(255, 0, 0));
		btnNuevoJuego.setBackground(new Color(175, 238, 238));
		btnNuevoJuego.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("Juego de Preguntas");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBackground(new Color(102, 205, 170));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 26));
		
		btnMostrarRanking = new JButton("Mostrar Ranking");
		btnMostrarRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMostrarRanking.setForeground(new Color(255, 69, 0));
		btnMostrarRanking.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		btnMostrarRanking.setBackground(new Color(175, 238, 238));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnMostrarRanking, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
						.addComponent(btnNuevoJuego, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
					.addGap(56))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(btnNuevoJuego, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(btnMostrarRanking, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(136))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
