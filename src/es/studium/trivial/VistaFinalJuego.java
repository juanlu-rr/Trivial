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
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;

public class VistaFinalJuego {

	JFrame frame;
	JButton btnFinalizar;
	JLabel puntuacionTotal;
	
	public VistaFinalJuego() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 205));
		frame.setBounds(100, 100, 739, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Juego de Preguntas");
		label.setForeground(new Color(255, 255, 0));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Snap ITC", Font.BOLD, 26));
		label.setBackground(new Color(102, 205, 170));
		
		btnFinalizar = new JButton("Finalizar");
		
		JLabel lblSuPuntuacion = new JLabel("Su puntuaci\u00F3n ha sido:");
		lblSuPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuPuntuacion.setForeground(Color.RED);
		lblSuPuntuacion.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSuPuntuacion.setBackground(new Color(230, 230, 250));
		
		puntuacionTotal = new JLabel("");
		puntuacionTotal.setBorder(new LineBorder(new Color(255, 255, 224), 4));
		puntuacionTotal.setHorizontalAlignment(SwingConstants.CENTER);
		puntuacionTotal.setForeground(new Color(255, 255, 224));
		puntuacionTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		puntuacionTotal.setBackground(new Color(230, 230, 250));
		
		JLabel lblPuntuacion = new JLabel("New label");
		lblPuntuacion.setBackground(new Color(0, 255, 255));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
					.addGap(0))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(296)
					.addComponent(btnFinalizar, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
					.addGap(300))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(lblSuPuntuacion, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addComponent(puntuacionTotal, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(76, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(123)
					.addComponent(lblPuntuacion, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(157, Short.MAX_VALUE))
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
					.addGap(45)
					.addComponent(lblPuntuacion, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(btnFinalizar, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
					.addGap(31))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
