package interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class InterfazCrearPersonaje extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private Imagen contentPane;
	
	private JPanel panelPrincipal;
	private JPanel panelCol1Central;
	private JPanel panelCol2Central;
	private JPanel panelCol3Central;
	private JPanel panelCol1;
	private JPanel panelCol2;
	private JPanel panelCol3;
	private JPanel panelComboRaza;
	private JPanel panelComboClase;
	private JComboBox comboBoxRazas;
	private JComboBox comboBoxClases;

	/**
	 * Create the frame.
	 */
	public InterfazCrearPersonaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 744);
		contentPane = new Imagen();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground("src/imegenes/imagenCreacion.jpg");
		setContentPane(contentPane);
		
		panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		GridBagLayout gbl_panelPrincipal = new GridBagLayout();
		gbl_panelPrincipal.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelPrincipal.rowHeights = new int[]{0, 0};
		gbl_panelPrincipal.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelPrincipal.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelPrincipal.setLayout(gbl_panelPrincipal);
		
		panelCol1 = new JPanel();
		GridBagConstraints gbc_panelCol1 = new GridBagConstraints();
		gbc_panelCol1.gridwidth = 3;
		gbc_panelCol1.insets = new Insets(0, 0, 0, 5);
		gbc_panelCol1.fill = GridBagConstraints.BOTH;
		gbc_panelCol1.gridx = 0;
		gbc_panelCol1.gridy = 0;
		panelPrincipal.add(panelCol1, gbc_panelCol1);
		panelCol1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRaza.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaza.setForeground(Color.WHITE);
		lblRaza.setFont(new Font("Kingdom Hearts", Font.PLAIN, 99));
		panelCol1.add(lblRaza, BorderLayout.NORTH);
		
		panelCol1Central = new JPanel();
		panelCol1.add(panelCol1Central, BorderLayout.CENTER);
		panelCol1Central.setLayout(new BorderLayout(0, 0));
		
		panelComboRaza = new JPanel();
		panelCol1Central.add(panelComboRaza, BorderLayout.NORTH);
		
		//con su vector
		String [] vRaza = new String[] {"Driade","Demonio","Nefilim","Enano","Angel","Troll","Humano","Hueco"};
		comboBoxRazas = new JComboBox(vRaza);
		comboBoxRazas.addActionListener(this);
		panelComboRaza.add(comboBoxRazas);
		
		panelCol2 = new JPanel();
		GridBagConstraints gbc_panelCol2 = new GridBagConstraints();
		gbc_panelCol2.gridwidth = 5;
		gbc_panelCol2.insets = new Insets(0, 0, 0, 5);
		gbc_panelCol2.fill = GridBagConstraints.BOTH;
		gbc_panelCol2.gridx = 3;
		gbc_panelCol2.gridy = 0;
		panelPrincipal.add(panelCol2, gbc_panelCol2);
		panelCol2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblInformacionDelPersonaje = new JLabel("Informacion del personaje");
		lblInformacionDelPersonaje.setVerticalAlignment(SwingConstants.BOTTOM);
		lblInformacionDelPersonaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacionDelPersonaje.setForeground(Color.WHITE);
		lblInformacionDelPersonaje.setFont(new Font("Kingdom Hearts", Font.PLAIN, 99));
		panelCol2.add(lblInformacionDelPersonaje, BorderLayout.NORTH);
		
		panelCol2Central = new JPanel();
		panelCol2.add(panelCol2Central, BorderLayout.CENTER);
		panelCol2Central.setLayout(new BorderLayout(0, 0));
		
		panelCol3 = new JPanel();
		GridBagConstraints gbc_panelCol3 = new GridBagConstraints();
		gbc_panelCol3.gridwidth = 3;
		gbc_panelCol3.fill = GridBagConstraints.BOTH;
		gbc_panelCol3.gridx = 8;
		gbc_panelCol3.gridy = 0;
		panelPrincipal.add(panelCol3, gbc_panelCol3);
		panelCol3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblClase = new JLabel("Clase");
		lblClase.setVerticalAlignment(SwingConstants.BOTTOM);
		lblClase.setHorizontalAlignment(SwingConstants.CENTER);
		lblClase.setForeground(Color.WHITE);
		lblClase.setFont(new Font("Kingdom Hearts", Font.PLAIN, 99));
		panelCol3.add(lblClase, BorderLayout.NORTH);
		
		panelCol3Central = new JPanel();
		panelCol3.add(panelCol3Central, BorderLayout.CENTER);
		panelCol3Central.setLayout(new BorderLayout(0, 0));
		
		panelComboClase = new JPanel();
		panelCol3Central.add(panelComboClase, BorderLayout.NORTH);
		
		
		//su vector de clases
		String [] vClases = new String[] {"Slayer","Guardian","Arquero","Hechicero","Brujo","Druida"};
		comboBoxClases = new JComboBox(vClases);
		panelComboClase.add(comboBoxClases);
		
		//pantalla completa
		setUndecorated(true); 
		setExtendedState(MAXIMIZED_BOTH);
		//----
		
		hacerOpacoTodo();
				
	}

	private void hacerOpacoTodo() {
		
		//hacer opaco todos los frames
		panelCol1.setOpaque(false);
		panelCol1Central.setOpaque(false);
		panelCol2.setOpaque(false);
		panelCol2Central.setOpaque(false);
		panelCol3.setOpaque(false);
		panelCol3Central.setOpaque(false);
		panelPrincipal.setOpaque(false);
		panelComboClase.setOpaque(false);
		panelComboRaza.setOpaque(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (comboBoxClases == e.getSource()) {
			
			switch ((String) comboBoxClases.getSelectedItem()) {
			case "":
				
				break;

			default:
				break;
			}
			
		}
		
		if (comboBoxRazas == e.getSource()) {
			
			switch ((String) comboBoxClases.getSelectedItem()) {
			case "":
				
				break;

			default:
				break;
			}
			
		}
		
	}

}
