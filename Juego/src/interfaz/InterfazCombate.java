package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import imagenes.Imagen;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazCombate extends JFrame {

	private JPanel contentPane;
	private Imagen guerrero;
	private Imagen atacar_heroe;

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
		guerrero.setBackground("src/imagenes/sprites/HeroeHombre/attack_sword.png");
		guerrero.setBounds(125, 187, 321, 301);
		fondo.add(guerrero);
		
		/* atacar_heroe = new Imagen();
			atacar_heroe.setBackground("");
			atacar_heroe.setBounds(383, 187, 321, 301);
			fondo.add(atacar_heroe);
			*/
		
		Imagen villano = new Imagen();
		villano.setBackground("src/imagenes/sprites/PerroCriatura/perro.png");
		villano.setBounds(578, 177, 338, 311);
		fondo.add(villano);
		
		JLabel lblMazmorrasDelCastillo = new JLabel("Mazmorras del Castillo");
		lblMazmorrasDelCastillo.setForeground(Color.WHITE);
		lblMazmorrasDelCastillo.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblMazmorrasDelCastillo.setBounds(371, 33, 306, 34);
		fondo.add(lblMazmorrasDelCastillo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.WHITE, 2));
		panel.setBounds(294, 506, 446, 115);
		fondo.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Atacar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			/*	atacar_heroe.setBackground("src/imagenes/sprites/crusader/crusader_A/attack_charge.png");		
				guerrero.setBackground("");*/
				
				guerrero.setBackground("src/imagenes/sprites/HeroeHombre/attack_charge.png");
				guerrero.setBounds(383, 187, 321, 301);

				
				
			}
			
		});
		
		posicionInicio();
		
		/*atacar_heroe.setBackground("");		
		guerrero.setBackground("src/imagenes/sprites/crusader/crusader_A/attack_sword.png");
		*/
		
		
		
		
		
		btnNewButton.setBounds(10, 11, 129, 48);
		panel.add(btnNewButton);
		
		JButton btnMagia = new JButton("Magia");
		btnMagia.setBounds(10, 56, 139, 48);
		panel.add(btnMagia);
		
		JButton btnDefender = new JButton("Defender");
		btnDefender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				guerrero.setBackground("src/imagenes/sprites/HeroeHombre/defend.png");
				
			}
		});
		
		btnDefender.setBounds(147, 11, 129, 48);
		panel.add(btnDefender);
		
		JButton btnObjetos = new JButton("Objetos");
		btnObjetos.setBounds(147, 56, 129, 48);
		panel.add(btnObjetos);
		
		
		
	}
	
	
	public void posicionInicio() {
		
		
		guerrero.setBackground("src/imagenes/sprites/HeroeHombre/attack_sword.png");
		guerrero.setBounds(125, 187, 321, 301);
		
		
	}
	
}
