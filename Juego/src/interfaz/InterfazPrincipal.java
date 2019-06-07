package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.BOSS;
import dominio.Criatura;
import dominio.Heroe;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class InterfazPrincipal extends JFrame {

	private static final int ANCHO = 1200;
	private static final int ALTO = 700;

	private Imagen contentPane;
	private Heroe heroePrincipal;


	private Criatura criatura = new Criatura(); 
	
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
		
		JPanel panel = new JPanel();
		panel.setBounds(880, 11, 284, 629);
		panelPrincipal.add(panel);
		
		JButton btnVsCriatura = new JButton("vs Criatura");
		btnVsCriatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				llamarCombateCriatura();
				
			}
		});
		btnVsCriatura.setBounds(274, 95, 89, 23);
		panelPrincipal.add(btnVsCriatura);
		
		JButton btnVsBoss = new JButton("vs Boss");
		btnVsBoss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//llamarCombateBoss
				
			}
		});
		btnVsBoss.setBounds(274, 209, 89, 23);
		panelPrincipal.add(btnVsBoss);

		JButton btnAumentarNivelMazmorra = new JButton("aumentar nivel mazmorra");
		btnAumentarNivelMazmorra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				switch (principal.getNivelMazmorra()) {

				case "1":

					principal.setNivelMazmorra("2");

					JOptionPane.showMessageDialog(null, "has aumentado a la mazmorra de nivel "+ principal.getNivelMazmorra());

					break;

				case "2":

					principal.setNivelMazmorra("2");
					
					principal.setNivelMazmorra("3");

					JOptionPane.showMessageDialog(null, "has aumentado a la mazmorra de nivel "+ principal.getNivelMazmorra());

					break;

				case "3":

					principal.setNivelMazmorra("3");
					
					principal.setNivelMazmorra("4");

					JOptionPane.showMessageDialog(null, "has aumentado a la mazmorra de nivel "+ principal.getNivelMazmorra()+", la maxima dificultad");

					break;

				default:
										
					JOptionPane.showMessageDialog(null, "No puedes aumentar mas el nivel de la mazmorra");
					
					break;
				}

			}
		});
		btnAumentarNivelMazmorra.setBounds(520, 95, 225, 23);
		panelPrincipal.add(btnAumentarNivelMazmorra);

		anadirFondo(nivelM);

	}

	protected void llamarCombateCriatura() {
		
		criatura = generarCriaturar();
		
		InterfazCombate i = new InterfazCombate(heroePrincipal, criatura);
		
		 i.setVisible(true);
		
		
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
	
	
	public Criatura generarCriaturar() {
		
		String aux = "";
	
		Criatura c = new Criatura();
		
		String nombreCriatua = "";
		String imagen = "";
		
		Random r = new Random();
		int nAleatorio = 2;
				//r.nextInt(3);
		
		if (nAleatorio == 0) {
			nombreCriatua = "Perro Sarnoso";
			imagen = "src/imagenes/sprites/PerroCriatura/perro.png";
			
			
		}else if (nAleatorio == 1) {
			nombreCriatua = "Araña Chunga";
			imagen = "src/imagenes/sprites/arañaChunga/attack_melee.png";
			
		}else if (nAleatorio == 2) {
			nombreCriatua = "Bruja";
			imagen = "src/imagenes/sprites/BrujaBoss/mujermala.png";
		}
		
		c = new Criatura(nombreCriatua, "",1, 20, 15, 350 , 0, 0 , imagen, "", 0);
			
		return c;
		
		
		
		
	}
	
}
