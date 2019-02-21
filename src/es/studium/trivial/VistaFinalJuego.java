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

public class VistaFinalJuego {

	JFrame frame;
	JTextField txtNombre;
	JButton btnFinalizar;
	JLabel puntuacionTotal;
	
	public VistaFinalJuego() {
		initialize();
	}


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
		
		JLabel lblIntroduzcaNombre = new JLabel("Introduzca su nombre: ");
		lblIntroduzcaNombre.setForeground(new Color(255, 0, 0));
		lblIntroduzcaNombre.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblIntroduzcaNombre.setBackground(new Color(230, 230, 250));
		lblIntroduzcaNombre.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnFinalizar = new JButton("Finalizar");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNombre.setColumns(10);
		
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblSuPuntuacion, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(puntuacionTotal, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblIntroduzcaNombre)
							.addGap(50)
							.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(55, Short.MAX_VALUE))
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
					.addGap(77)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblIntroduzcaNombre, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(60)
					.addComponent(btnFinalizar, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
					.addGap(31))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
