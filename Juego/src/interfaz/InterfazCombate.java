package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.lang.Thread;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import imagenes.Imagen;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazCombate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Imagen guerrero;
	private Imagen villano;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCombate frame = new InterfazCombate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazCombate() {
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 650);

		Imagen fondo = new Imagen();
		fondo.setBackground("src/imagenes/escenarios/fondo2.jpg");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(fondo);
		fondo.setLayout(null);

		guerrero = new Imagen();
		// marca la posicion de inicio del bueno
		posicionInicio();

		fondo.add(guerrero);

		villano = new Imagen();
		posicionInicioMalo();
		fondo.add(villano);

		JLabel lblMazmorrasDelCastillo = new JLabel("Mazmorras del Castillo");
		lblMazmorrasDelCastillo.setForeground(Color.WHITE);
		lblMazmorrasDelCastillo.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblMazmorrasDelCastillo.setBounds(371, 33, 306, 34);
		fondo.add(lblMazmorrasDelCastillo);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.WHITE, 2));
		panel.setBounds(12, 506, 997, 115);
		fondo.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Atacar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				new Thread(new Runnable() {
					
					@Override
					public void run() {
						atacarHeroe();
					}
				}).start();
				
			}
		});

		btnNewButton.setBounds(378, 11, 129, 48);
		panel.add(btnNewButton);

		JButton btnMagia = new JButton("Magia");
		btnMagia.setBounds(378, 56, 129, 48);
		panel.add(btnMagia);

		JButton btnDefender = new JButton("Defender");
		btnDefender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				guerrero.setBackground("src/imagenes/sprites/HeroeHombre/defend.png");

			}
		});

		btnDefender.setBounds(513, 11, 129, 48);
		panel.add(btnDefender);

		JButton btnObjetos = new JButton("Objetos");
		btnObjetos.setBounds(513, 56, 129, 48);
		panel.add(btnObjetos);

	}

	public void posicionInicio() {

		guerrero.setBackground("src/imagenes/sprites/HeroeHombre/attack_sword.png");
		guerrero.setBounds(113, 187, 321, 301);

	}

	public void posicionInicioMalo() {

		villano.setBackground("src/imagenes/sprites/PerroCriatura/perro.png");
		villano.setBounds(578, 177, 338, 311);

	}

	public void atacarHeroe() {
		
		bloquearBotones();

		guerrero.setBackground("src/imagenes/sprites/HeroeHombre/attack_charge.png");
		for (int i = 113; i < 383; i++) {
			guerrero.setBounds(i, 187, 321, 301);
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		// TODO Auto-generated method stub

			}
		}
		
		for (int i = 383; i > 113; i--) {
			
			guerrero.setBounds(i, 187, 321, 301);
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		guerrero.setBackground("src/imagenes/sprites/HeroeHombre/attack_sword.png");

	}

	private void bloquearBotones() {
		
		
		
	}

	public void turnoMalo() {

	}

}
