package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Heroe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class InterfazCrearPersonaje extends JFrame implements ActionListener{

	private static final int ANCHO = 1200;
	private static final int ALTO = 700;

	private static final long serialVersionUID = 1L;
	private Imagen contentPane;
	private Imagen panelImagenHeroe;

	private JPanel panelPrincipal;
	private JComboBox comboBoxClases;
	private JLabel lblCreacionDelPersonaje;
	private JLabel lblDimeTuNombre;
	private JTextField textFieldNombre;
	private JLabel lblEstasSernTus;
	private JLabel lblVitalidad;
	private JLabel lblDefensa;
	private JLabel lblAtaque;
	private JLabel lblProbCritico;
	private JLabel lblClase;
	private JLabel lblLoreDeCada;
	private JLabel lblMagia;
	
	private Heroe Guerrero;
	private Heroe Asesino;
	private Heroe Hechicera;
	private JTextField textFieldVit;
	private JTextField textFieldDefensa;
	private JTextField textFieldAtaque;
	private JTextField textFieldCritico;
	private JTextField textFieldMagia;
	private JTextField textFieldClase;

	/**
	 * Create the frame.
	 */
	public InterfazCrearPersonaje() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, ANCHO, ALTO);
		contentPane = new Imagen();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground("src/imagenes/imagenCreacion.jpg");
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String [] vClases = new String[] {"Selecciona tu clase...","Guerrero","Asesino","Hechicera"};

		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(5, 5, 1190, 659);
		panelPrincipal.setOpaque(false);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);

		JPanel panelInfo = new JPanel();
		panelInfo.setBounds(0, 0, 704, 659);
		panelPrincipal.add(panelInfo);
		panelInfo.setOpaque(false);
		panelInfo.setLayout(null);
		
		lblCreacionDelPersonaje = new JLabel("Creacion del personaje");
		lblCreacionDelPersonaje.setForeground(Color.WHITE);
		lblCreacionDelPersonaje.setFont(new Font("Dialog", Font.BOLD, 42));
		lblCreacionDelPersonaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreacionDelPersonaje.setBounds(12, 56, 680, 79);
		panelInfo.add(lblCreacionDelPersonaje);
		
		lblDimeTuNombre = new JLabel("Dime tu nombre:");
		lblDimeTuNombre.setForeground(Color.WHITE);
		lblDimeTuNombre.setBounds(22, 147, 135, 15);
		panelInfo.add(lblDimeTuNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(162, 147, 435, 19);
		panelInfo.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		lblEstasSernTus = new JLabel("Estas serán tus estadísticas");
		lblEstasSernTus.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstasSernTus.setForeground(Color.WHITE);
		lblEstasSernTus.setFont(new Font("Dialog", Font.BOLD, 25));
		lblEstasSernTus.setBounds(12, 174, 680, 66);
		panelInfo.add(lblEstasSernTus);
		
		lblVitalidad = new JLabel("Vitalidad:");
		lblVitalidad.setForeground(Color.WHITE);
		lblVitalidad.setBounds(22, 263, 94, 15);
		panelInfo.add(lblVitalidad);
		
		lblDefensa = new JLabel("Defensa: ");
		lblDefensa.setForeground(Color.WHITE);
		lblDefensa.setBounds(22, 290, 94, 15);
		panelInfo.add(lblDefensa);
		
		lblAtaque = new JLabel("Ataque:");
		lblAtaque.setForeground(Color.WHITE);
		lblAtaque.setBounds(22, 317, 107, 15);
		panelInfo.add(lblAtaque);
		
		lblProbCritico = new JLabel("Probabilidad de critico");
		lblProbCritico.setForeground(Color.WHITE);
		lblProbCritico.setBounds(22, 344, 172, 15);
		panelInfo.add(lblProbCritico);
		
		lblClase = new JLabel("Clase:");
		lblClase.setForeground(Color.WHITE);
		lblClase.setBounds(22, 401, 135, 15);
		panelInfo.add(lblClase);
		
		lblLoreDeCada = new JLabel("LORE DE CADA CLASE");
		lblLoreDeCada.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoreDeCada.setBounds(12, 431, 682, 216);
		panelInfo.add(lblLoreDeCada);
		
		lblMagia = new JLabel("Magia:");
		lblMagia.setForeground(Color.WHITE);
		lblMagia.setBounds(22, 371, 66, 15);
		panelInfo.add(lblMagia);
		
		textFieldVit = new JTextField();
		textFieldVit.setEditable(false);
		textFieldVit.setBounds(229, 261, 124, 19);
		panelInfo.add(textFieldVit);
		textFieldVit.setColumns(10);
		
		textFieldDefensa = new JTextField();
		textFieldDefensa.setEditable(false);
		textFieldDefensa.setBounds(229, 288, 124, 19);
		panelInfo.add(textFieldDefensa);
		textFieldDefensa.setColumns(10);
		
		textFieldAtaque = new JTextField();
		textFieldAtaque.setEditable(false);
		textFieldAtaque.setBounds(229, 315, 124, 19);
		panelInfo.add(textFieldAtaque);
		textFieldAtaque.setColumns(10);
		
		textFieldCritico = new JTextField();
		textFieldCritico.setEditable(false);
		textFieldCritico.setBounds(229, 342, 124, 19);
		panelInfo.add(textFieldCritico);
		textFieldCritico.setColumns(10);
		
		textFieldMagia = new JTextField();
		textFieldMagia.setEditable(false);
		textFieldMagia.setBounds(229, 369, 124, 19);
		panelInfo.add(textFieldMagia);
		textFieldMagia.setColumns(10);
		
		textFieldClase = new JTextField();
		textFieldClase.setEditable(false);
		textFieldClase.setBounds(229, 399, 124, 19);
		panelInfo.add(textFieldClase);
		textFieldClase.setColumns(10);

		JPanel panelClase = new JPanel();
		panelClase.setBounds(728, 0, 462, 659);
		panelClase.setOpaque(false);
		panelPrincipal.add(panelClase);
		panelClase.setLayout(null);

		comboBoxClases = new JComboBox(vClases);
		comboBoxClases.addActionListener(this);
		comboBoxClases.setBounds(29, 12, 406, 24);
		panelClase.add(comboBoxClases);

		panelImagenHeroe = new Imagen();
		panelImagenHeroe.setBounds(39, 48, 381, 553);
		panelImagenHeroe.setOpaque(false);
		panelClase.add(panelImagenHeroe);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				continuar();
				
			}
		});
		btnContinuar.setBounds(348, 634, 114, 25);
		panelClase.add(btnContinuar);

		//pantalla completa
		//setUndecorated(true); 
		//setExtendedState(MAXIMIZED_BOTH);
		//----

		panelPrincipal.setOpaque(false);
		
		crearPersonajesEstandar();

	}

	protected void continuar() {

		int resp=JOptionPane.showConfirmDialog(null,"Quieres empezar tu historia como " + textFieldNombre.getText() + ", " + textFieldClase.getText());
		
	      if (JOptionPane.OK_OPTION == resp){
	    	  
	   System.out.println("Selecciona opción Afirmativa");
	 }
	      else{
	    System.out.println("No selecciona una opción afirmativa");
	   }
		
	}

	private void crearPersonajesEstandar() {

		Guerrero = new Heroe(
				
				"",//nombre
				"",//procedencia
				1,//lvl
				150,//defensa
				30,//atk
				500,//vit
				0,//magia
				5,//critico
				"",//raza
				"Guerrero"//clase
				
				);
		
		Asesino = new Heroe(
				
				"",//nombre
				"",//procedencia
				1,//lvl
				70,//defensa
				110,//atk
				200,//vit
				0,//magia
				20,//critico
				"",//raza
				"Asesino"//clase
				
				);
		
		Hechicera = new Heroe(
				
				"",//nombre
				"",//procedencia
				1,//lvl
				100,//defensa
				10,//atk
				400,//vit
				200,//magia
				0,//critico
				"",//raza
				"Hechicera"//clase
				
				);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String ataque;
		
		if (comboBoxClases == e.getSource()) {

			switch ((String) comboBoxClases.getSelectedItem()) {
			case "Guerrero":
				
				panelImagenHeroe.setBackground("src/imagenes/sprites/HeroeHombre/heroic.png");
				
				textFieldVit.setText(String.valueOf(Guerrero.getVitalidadPropia()));
				textFieldAtaque.setText(String.valueOf(Guerrero.getFuerzaPropia()));
				textFieldClase.setText("Guerrero");
				textFieldCritico.setText(String.valueOf(Guerrero.getCritico())+ "%");
				textFieldDefensa.setText(String.valueOf(Guerrero.getDefensaPropia()));
				textFieldMagia.setText(String.valueOf(Guerrero.getmagia()));				
				
				break;
				
			case "Hechicera":

				panelImagenHeroe.setBackground("src/imagenes/sprites/Heroina/heroic.png");
				
				textFieldVit.setText(String.valueOf(Hechicera.getVitalidadPropia()));
				textFieldAtaque.setText(String.valueOf(Hechicera.getFuerzaPropia()));
				textFieldClase.setText("Hechicera");
				textFieldCritico.setText(String.valueOf(Hechicera.getCritico())+ "%");
				textFieldDefensa.setText(String.valueOf(Hechicera.getDefensaPropia()));
				textFieldMagia.setText(String.valueOf(Hechicera.getmagia()));
				
				break;
				
			case "Asesino":

				panelImagenHeroe.setBackground("src/imagenes/sprites/AsesinoHeroe/heroic.png");
				
				textFieldVit.setText(String.valueOf(Asesino.getVitalidadPropia()));
				textFieldAtaque.setText(String.valueOf(Asesino.getFuerzaPropia()));
				textFieldClase.setText("Asesino");
				textFieldCritico.setText(String.valueOf(Asesino.getCritico()) + "%");
				textFieldDefensa.setText(String.valueOf(Asesino.getDefensaPropia()));
				textFieldMagia.setText(String.valueOf(Asesino.getmagia()));
				
				break;

			default:
				
				panelImagenHeroe.setBackground("");
				
				textFieldVit.setText("");
				textFieldAtaque.setText("");
				textFieldClase.setText("No eres nada");
				textFieldCritico.setText("");
				textFieldDefensa.setText("");
				textFieldMagia.setText("");
				
				
				break;
			}

		}



	}
}
