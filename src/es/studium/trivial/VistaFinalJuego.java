package es.studium.trivial;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

public class VistaFinalJuego {

	JFrame frame;
	JLabel puntuacionTotal;
	
	public VistaFinalJuego() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 205));
		frame.setBounds(100, 100, 657, 458);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel label = new JLabel("Juego de Preguntas");
		label.setForeground(new Color(255, 255, 0));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Snap ITC", Font.BOLD, 26));
		label.setBackground(new Color(102, 205, 170));
		
		JLabel lblSuPuntuacion = new JLabel("Su puntuaci\u00F3n ha sido:");
		lblSuPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuPuntuacion.setForeground(Color.RED);
		lblSuPuntuacion.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSuPuntuacion.setBackground(new Color(230, 230, 250));
		
		puntuacionTotal = new JLabel("");
		puntuacionTotal.setOpaque(true);
		puntuacionTotal.setBorder(new LineBorder(new Color(255, 255, 224), 4));
		puntuacionTotal.setHorizontalAlignment(SwingConstants.CENTER);
		puntuacionTotal.setForeground(new Color(0, 0, 0));
		puntuacionTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		puntuacionTotal.setBackground(new Color(255, 255, 255));
		
		JLabel lblGracias = new JLabel("GRACIAS POR JUGAR");
		lblGracias.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		lblGracias.setHorizontalAlignment(SwingConstants.CENTER);
		lblGracias.setForeground(Color.GREEN);
		lblGracias.setFont(new Font("Snap ITC", Font.BOLD, 30));
		lblGracias.setBackground(new Color(0, 0, 0));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
					.addGap(0))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(lblSuPuntuacion, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(puntuacionTotal, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(81)
					.addComponent(lblGracias, GroupLayout.PREFERRED_SIZE, 461, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(9)
					.addComponent(label)
					.addGap(67)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSuPuntuacion, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(puntuacionTotal, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addGap(73)
					.addComponent(lblGracias, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(84, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
