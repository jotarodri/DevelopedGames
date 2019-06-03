package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Heroe;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazNivelMazmorraEntrar extends JFrame {

	private Heroe principal; 

	private static final int ANCHO = 1200;
	private static final int ALTO = 700;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JButton buttonLVL1;
	private JButton buttonLVL2;
	private JButton buttonLVL3;
	private JButton buttonFinal;

	/**
	 * Create the frame.
	 */
	public InterfazNivelMazmorraEntrar(Heroe h) {
		
		principal = h;
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, ANCHO, ALTO);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNivelDeMazmorra = new JLabel("Nivel de mazmorra");
		lblNivelDeMazmorra.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNivelDeMazmorra.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivelDeMazmorra.setBounds(10, 11, 1174, 101);
		contentPane.add(lblNivelDeMazmorra);
		
		buttonLVL1 = new JButton("1");
		buttonLVL1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				entrarMenuPrincipal();
				
			}
		});
		buttonLVL1.setEnabled(false);
		buttonLVL1.setBounds(43, 112, 270, 157);
		contentPane.add(buttonLVL1);
		
		buttonLVL2 = new JButton("2");
		buttonLVL2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		buttonLVL2.setEnabled(false);
		buttonLVL2.setBounds(452, 112, 270, 157);
		contentPane.add(buttonLVL2);
		
		buttonLVL3 = new JButton("3");
		buttonLVL3.setEnabled(false);
		buttonLVL3.setBounds(882, 112, 270, 157);
		contentPane.add(buttonLVL3);
		
		buttonFinal = new JButton("Final");
		buttonFinal.setEnabled(false);
		buttonFinal.setBounds(216, 321, 757, 238);
		contentPane.add(buttonFinal);
		
		enableBoton();
	}

	protected void entrarMenuPrincipal() {

		System.out.println(buttonLVL1.getText());
		
	}

	private void enableBoton() {

		switch (principal.getNivelMazmorra()) {
		
		case "1":
			
			buttonLVL1.setEnabled(true);
			
			break;
			
		case "2":
			
			buttonLVL2.setEnabled(true);
			
			break;
			
		case "3":
			
			buttonLVL3.setEnabled(true);
			
			break;
			
		case "final":
			
			buttonFinal.setEnabled(true);
			
			break;

		default:
			break;
		}
		
	}
}
