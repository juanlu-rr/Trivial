package es.studium.trivial;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import javax.swing.border.LineBorder;

public class VistaPregunta2 {

	JFrame frame;
	JTextArea pregunta1;
	JRadioButton respuesta1;
	JRadioButton respuesta2;
	JRadioButton respuesta3;
	JButton btnSiguiente;
	JButton btnVolver;
	JButton btnComprobar;
	JLabel lblComprueba;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public VistaPregunta2() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0, 0, 205));
		frame.setBounds(100, 100, 690, 606);
		
		JLabel label = new JLabel("Juego de Preguntas");
		label.setForeground(new Color(255, 255, 0));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Snap ITC", Font.BOLD, 26));
		label.setBackground(new Color(102, 205, 170));
		
		pregunta1 = new JTextArea("");
		pregunta1.setEditable(false);
		pregunta1.setLineWrap(true);
		pregunta1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		pregunta1.setForeground(new Color(0, 0, 0));
		pregunta1.setFont(new Font("Tahoma", Font.BOLD, 15));
		pregunta1.setBackground(new Color(173, 216, 230));
		
		respuesta1 = new JRadioButton("");
		buttonGroup.add(respuesta1);
		respuesta2 = new JRadioButton("");
		buttonGroup.add(respuesta2);
		respuesta3 = new JRadioButton("");
		buttonGroup.add(respuesta3);
		
		btnSiguiente = new JButton("Siguiente");
		btnVolver = new JButton("Volver");
		btnComprobar = new JButton("Comprobar Respuesta");
			
		lblComprueba = new JLabel("");
		lblComprueba.setBackground(new Color(0, 0, 0));
		lblComprueba.setForeground(new Color(255, 255, 255));
		lblComprueba.setBorder(new LineBorder(new Color(0, 255, 255), 3));
		lblComprueba.setHorizontalAlignment(SwingConstants.LEFT);
		lblComprueba.setFont(new Font("Snap ITC", Font.BOLD, 16));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label, GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(respuesta2, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
									.addComponent(btnSiguiente, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
								.addComponent(pregunta1, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
								.addComponent(respuesta3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
								.addComponent(respuesta1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
								.addComponent(lblComprueba, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
							.addGap(34)))
					.addGap(0))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(258, Short.MAX_VALUE)
					.addComponent(btnComprobar)
					.addGap(255))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(9)
					.addComponent(label)
					.addGap(29)
					.addComponent(pregunta1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(respuesta1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(respuesta2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(respuesta3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(btnComprobar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(lblComprueba, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSiguiente, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(41))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
