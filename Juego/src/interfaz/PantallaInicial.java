package interfaz;

import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;
import static javax.sound.sampled.AudioSystem.getAudioInputStream;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import pruebasMusica.AudioFilePlayer;

import javax.swing.JLabel;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.DataLine.Info;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class PantallaInicial extends JFrame {

	/**
	 * 
	 */
	private static final int ANCHO = 1200;
	private static final int ALTO = 700;
	private static final long serialVersionUID = 1L;
	private Imagen contentPane;
	//private AudioFilePlayer player;
	private InterfazCrearPersonaje crear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicial frame = new PantallaInicial();
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
	public PantallaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, ANCHO, ALTO);
		contentPane = new Imagen();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//pantalla completa
		//setUndecorated(true); 
		//setExtendedState(MAXIMIZED_BOTH);
		//----
		
		contentPane.setBackground("src/imagenes/imagenInterfazNG.jpg");
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//
		//player = new AudioFilePlayer ();
		//
		
		Imagen panelTop = new Imagen();
		panelTop.setOpaque(false);
		contentPane.add(panelTop, BorderLayout.NORTH);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PantallaInicial.class.getResource("/imagenes/titulo.png")));
		panelTop.add(label);
		
		JPanel panelBottom = new JPanel();
		panelBottom.setOpaque(false);
		contentPane.add(panelBottom, BorderLayout.SOUTH);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				
			}
		});
		
		JButton btnNuevaPartida = new JButton("Nueva partida");
		btnNuevaPartida.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				llamar();			
				
			}
		});
		panelBottom.add(btnNuevaPartida);
		
		JButton btnCargarPartida = new JButton("Cargar partida");
		btnCargarPartida.setEnabled(false);
		panelBottom.add(btnCargarPartida);
		panelBottom.add(btnCerrar);
		
       //player.play("src/musica/cancionkh3.wav");
        


	}
	
    protected void llamar() {
    	
    	crear = new InterfazCrearPersonaje();
    	crear.setVisible(true);
    	setVisible(false);

	}

	public void play(String filePath) {
        final File file = new File(filePath);

        try (final AudioInputStream in = getAudioInputStream(file)) {

            final AudioFormat outFormat = getOutFormat(in.getFormat());
            final Info info = new Info(SourceDataLine.class, outFormat);

            try (final SourceDataLine line =
                     (SourceDataLine) AudioSystem.getLine(info)) {

                if (line != null) {
                    line.open(outFormat);
                    line.start();
                    stream(getAudioInputStream(outFormat, in), line);
                    line.drain();
                    line.stop();
                }
            }

        } catch (UnsupportedAudioFileException 
               | LineUnavailableException 
               | IOException e) {
            throw new IllegalStateException(e);
        }
    }
    
    private AudioFormat getOutFormat(AudioFormat inFormat) {
        final int ch = inFormat.getChannels();

        final float rate = inFormat.getSampleRate();
        return new AudioFormat(PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);
    }

    private void stream(AudioInputStream in, SourceDataLine line) 
        throws IOException {
        final byte[] buffer = new byte[4096];
        for (int n = 0; n != -1; n = in.read(buffer, 0, buffer.length)) {
            line.write(buffer, 0, n);
        }
    }
}
