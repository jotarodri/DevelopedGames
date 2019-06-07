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
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

import dominio.BOSS;
import dominio.Combate;
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
	private Heroe personajePrincipal;
	private Criatura maloMaloso;
	private JLabel lblVidaDelEnemigo;
	private JLabel lblTuVida;
	
	private String imagenEstandar;
	private String ImagenAtacar;
	private String ImagenDefender;
	
	private String imagenEstandarMalo;
	private String ImagenAtacarMalo;
	private String ImagenDefenderMalo;
	
	private Combate combateVS;


	/**
	 * Create the frame.
	 */
	public InterfazCombate(Heroe principal, Criatura malo) {
		
		personajePrincipal = principal;
		maloMaloso = malo;
		
		combateVS = new Combate(personajePrincipal, maloMaloso);
		
		establecerImagenes();
		
		//this.bueno =(Heroe) Bueno;
		
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

				combateVS.resetearStatsHeroe();
				combateVS.atacar();

				new Thread(new Runnable() {
					@Override
					public void run() {
						atacarHeroe();
					}
				}).start();
				
				condicionFinal();
				
				actualizarVidas();
																
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
				
				combateVS.resetearStatsHeroe();
				guerrero.setBackground(ImagenDefender);
				combateVS.defender();
				turnoMalo();

			}
		});

		btnDefender.setBounds(513, 11, 129, 48);
		panel.add(btnDefender);

		btnObjetos = new JButton("Objetos");
		btnObjetos.setBounds(513, 56, 129, 48);
		panel.add(btnObjetos);
		
		lblTuVida = new JLabel();
		lblTuVida.setBounds(28, 38, 172, 38);
		panel.add(lblTuVida);
		
		lblVidaDelEnemigo = new JLabel("Vida del enemigo = " + maloMaloso.getVitalidadPropia());
		lblVidaDelEnemigo.setBounds(719, 38, 236, 33);
		panel.add(lblVidaDelEnemigo);
		
		actualizarVidas();
		condicionFinal();

	}

	private void actualizarVidas() {

		lblVidaDelEnemigo.setText("Vida del enemigo = " + maloMaloso.getVitalidadPropia());
		lblTuVida.setText("Tu vida = " + personajePrincipal.getVitalidadPropia());
		
	}

	public void posicionInicio() {

		guerrero.setBackground(imagenEstandar);
		guerrero.setBounds(113, 187, 321, 301);

	}

	public void posicionInicioMalo() {

		
		villano.setBackground(maloMaloso.getImagen());
		villano.setBounds(578, 177, 338, 311);

	}

	public void atacarHeroe() {
		
		bloquearBotones();

		guerrero.setBackground(ImagenAtacar);
		
		for (int i = 113; i < 383; i++) {
			
			guerrero.setBounds(i, 187, 321, 301);
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		
		for (int i = 383; i > 113; i--) {
			
			guerrero.setBounds(i, 187, 321, 301);
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		guerrero.setBackground(imagenEstandar);
		
		turnoMalo();
		condicionFinal();

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
				
		Random rand = new Random();
		
		int n = rand.nextInt(2);
		
		switch (n) {
		
		case 0:
			
			combateVS.resetearStatsCriatura();
									
			new Thread(new Runnable() {
				
				@Override
				public void run() {

					atacarVillano();					
					permitirBotones();
					actualizarVidas();

				}
			}).start();
			
			combateVS.atacar();
			
			actualizarVidas();
			break;

		case 1:

			combateVS.resetearStatsCriatura();
			combateVS.defender();
			
			villano.setBackground(ImagenDefenderMalo);
			//TODO accion defender
			permitirBotones();
			break;

		default:
			break;
		}

	}

	protected void atacarVillano() {

		villano.setBackground(ImagenAtacarMalo);
		
		for (int i = 578; i > 120; i--) {
			
			villano.setBounds(i, 177, 338, 311);
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		for (int i = 120; i < 578; i++) {
			
			villano.setBounds(i, 177, 338, 311);
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		villano.setBackground(imagenEstandarMalo);
		

	}
	
	private void condicionFinal() {
	
		if (maloMaloso.getVitalidadPropia() <= 0) {
			
			JOptionPane.showMessageDialog(null, "Ha muerto el boss");
			//funcion exp
			dispose();
			
		} 
		
		if (personajePrincipal.getVitalidadPropia() <=0) {
			
			JOptionPane.showMessageDialog(null, "Has muerto tonto");
			//funcion exp
			dispose();
			
		}
		
	}
	
	private void establecerImagenes() {
		
		switch (personajePrincipal.getClase()) {
		
	case "Guerrero":
		imagenEstandar = personajePrincipal.getImagen();
		ImagenAtacar = "src/imagenes/sprites/HeroeHombre/attack_charge.png";
		ImagenDefender = "src/imagenes/sprites/HeroeHombre/defend.png";
		break;

	case "Asesino":
		imagenEstandar = personajePrincipal.getImagen();
		ImagenAtacar = "src/imagenes/sprites/AsesinoHeroe/attack_dagger.png";
		ImagenDefender = "src/imagenes/sprites/AsesinoHeroe/defend.png";
		break;
		
	case "Hechicera":
		imagenEstandar = personajePrincipal.getImagen();
		ImagenAtacar = "src/imagenes/sprites/Heroina/attack_mace.png";
		ImagenDefender = "src/imagenes/sprites/Heroina/defend.png";
		break;
		
	}
		
		
	switch (maloMaloso.getNombre()) {
	
	case "Perro Sarnoso":
		imagenEstandarMalo = maloMaloso.getImagen();
		ImagenAtacarMalo = "src/imagenes/sprites/PerroCriatura/attack_melee.png";
		ImagenDefenderMalo = "src/imagenes/sprites/PerroCriatura/defend.png";
		break;

	case "Bruja":
		imagenEstandarMalo = maloMaloso.getImagen();
		ImagenAtacarMalo = "src/imagenes/sprites/BrujaBoss/mujermala.png";
		ImagenDefenderMalo = "src/imagenes/sprites/BrujaBoss/defendMujer.png";
		break;
		
	case "Araña Chunga":
		imagenEstandarMalo = maloMaloso.getImagen();
		ImagenAtacarMalo = "src/imagenes/sprites/arañaChunga/attack_melee.png";
		ImagenDefenderMalo = "src/imagenes/sprites/arañaChunga/defend.png";
		break;
		
		
	}	
			
	}
	
	
}
