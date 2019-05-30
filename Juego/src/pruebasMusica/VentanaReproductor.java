package pruebasMusica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaReproductor extends JFrame {

	private JPanel contentPane;
	
	private AudioFilePlayer player;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaReproductor frame = new VentanaReproductor();
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
	public VentanaReproductor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				hacerPlay("src/musica/cancionkh3.wav");
				
			}
		});
		panel.add(btnPlay);

		JButton btnContinuar = new JButton("Continuar");
		panel.add(btnContinuar);

		JButton btnPausa = new JButton("Pausa");
		panel.add(btnPausa);

		JButton btnStop = new JButton("Stop");
		panel.add(btnStop);


	}

	protected void hacerPlay(String path) {

		player.play(path);
		
	}

}
