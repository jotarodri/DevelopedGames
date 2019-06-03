package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Heroe;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazPrincipal extends JFrame {

	private static final int ANCHO = 1200;
	private static final int ALTO = 700;

	private Imagen contentPane;
	private Heroe heroePrincipal;

	/**
	 * Create the frame.
	 */
	public InterfazPrincipal(Heroe principal, String nivelM) {

		this.heroePrincipal = principal;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, ANCHO, ALTO);
		contentPane = new Imagen();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		setContentPane(contentPane);

		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setOpaque(false);
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(null);
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBounds(1168, 12, -288, 635);
		panelPrincipal.add(panelInfo);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				InterfazNivelMazmorraEntrar atras = new InterfazNivelMazmorraEntrar(principal);
				atras.setVisible(true);
				setVisible(false);
				
			}
		});
		btnAtras.setBounds(12, 610, 114, 25);
		panelPrincipal.add(btnAtras);

		anadirFondo(nivelM);

	}

	private void anadirFondo(String nivelM) {

		switch (nivelM) {
		case "1":

			contentPane.setBackground("src/imagenes/escenarios/fondoInicial1.jpg");

			break;
		case "2":

			contentPane.setBackground("src/imagenes/escenarios/fondoInicial2.jpg");

			break;
		case "3":

			contentPane.setBackground("src/imagenes/escenarios/fondoInicial3.jpg");

			break;
		case "4":

			contentPane.setBackground("src/imagenes/escenarios/fondoInicial4.jpg");

			break;

		}
		
	}
}
