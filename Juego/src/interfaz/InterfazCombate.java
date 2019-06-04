package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.lang.Thread;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import imagenes.Imagen;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

import dominio.BOSS;
import dominio.Criatura;
import dominio.Heroe;
import dominio.Personaje;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazCombate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Heroe bueno;
	private BOSS maloBoss;
	private Criatura maloCriatura;
	
	private JPanel contentPane;
	private Imagen guerrero;
	private Imagen villano;
	private JButton btnMagia;
	private JButton btnNewButton;
	private JButton btnDefender;
	private JButton btnObjetos;
	private JButton btnHuir;
	
/*
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
	}*/

	/**
	 * Create the frame.
	 */
	public InterfazCombate(Personaje Bueno, Personaje Malo) {
		
		this.bueno =(Heroe) Bueno;
		
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

		btnNewButton = new JButton("Atacar");
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

		btnMagia = new JButton("Magia");
		btnMagia.setBounds(378, 56, 129, 48);
		panel.add(btnMagia);

		 btnDefender = new JButton("Defender");
		btnDefender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				guerrero.setBackground("src/imagenes/sprites/HeroeHombre/defend.png");

			}
		});

		btnDefender.setBounds(513, 11, 129, 48);
		panel.add(btnDefender);

		btnObjetos = new JButton("Objetos");
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
				e.printStackTrace();

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
		
		turnoMalo();

	}

	private void bloquearBotones() {
		btnDefender.setEnabled(false);
		btnMagia.setEnabled(false);
		btnObjetos.setEnabled(false);
		btnNewButton.setEnabled(false);	
	}
	
	private void permitirBotones() {
		
		btnDefender.setEnabled(true);
		btnMagia.setEnabled(true);
		btnObjetos.setEnabled(true);
		btnNewButton.setEnabled(true);
		
	}

	public void turnoMalo() {
		
		System.out.println("turno del boss");
		
		Random rand = new Random();
		
		int n = rand.nextInt(2);
		
		switch (n) {
		
		case 0:
									
			new Thread(new Runnable() {
				
				@Override
				public void run() {

					atacarVillano();					
					permitirBotones();

				}
			}).start();

			break;

		case 1:

			villano.setBackground("src/imagenes/sprites/PerroCriatura/defend.png");
			
			//TODO accion defender
			permitirBotones();
			break;

		default:
			break;
		}

	}

	protected void atacarVillano() {

		villano.setBackground("src/imagenes/sprites/PerroCriatura/attack_melee.png");
		
		for (int i = 578; i > 120; i--) {
			
			villano.setBounds(i, 177, 338, 311);
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		for (int i = 120; i < 578; i++) {
			
			villano.setBounds(i, 177, 338, 311);
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		villano.setBackground("src/imagenes/sprites/PerroCriatura/perro.png");
		

	}

}
