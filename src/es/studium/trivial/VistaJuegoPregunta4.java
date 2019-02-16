package es.studium.trivial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;

public class VistaJuegoPregunta4 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaJuegoPregunta4 window = new VistaJuegoPregunta4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaJuegoPregunta4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 205));
		frame.setBounds(100, 100, 739, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Juego de Preguntas");
		label.setForeground(new Color(255, 255, 0));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Snap ITC", Font.BOLD, 26));
		label.setBackground(new Color(102, 205, 170));
		
		JLabel pregunta1 = new JLabel("");
		pregunta1.setFont(new Font("Tahoma", Font.BOLD, 15));
		pregunta1.setBackground(Color.WHITE);
		pregunta1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnSiguiente = new JButton("Siguiente");
		
		JRadioButton respuesta1 = new JRadioButton("");
		
		JRadioButton respuesta2 = new JRadioButton("");
		
		JRadioButton respuesta3 = new JRadioButton("");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(respuesta1, GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
								.addComponent(respuesta2, GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
								.addComponent(respuesta3, GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
								.addComponent(pregunta1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
					.addGap(0))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(296)
					.addComponent(btnSiguiente, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
					.addGap(300))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(9)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pregunta1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(respuesta1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(respuesta2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(respuesta3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(64)
					.addComponent(btnSiguiente, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
					.addGap(31))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
