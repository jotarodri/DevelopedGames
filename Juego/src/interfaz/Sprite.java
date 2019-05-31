package interfaz;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Sprite extends JFrame implements Runnable{

	
	int ancho = 1021;
	int altp = 650;
	
	Image img;
	Thread hilo;
	int incremento = 0;
	
	
	public Sprite() {
		
		setSize(ancho, altp);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Animacion");
		setResizable(false);
		Toolkit herramiento = Toolkit.getDefaultToolkit();
		img = herramiento.getImage(getClass().getResource("src/imagenes/sprites/espada1.jpg"));
		hilo.start();
	}
	
	@Override
	public void paint(Graphics g) {
		
		Graphics2D g2d;		
		g2d = (Graphics2D)g;
		
		int mx = (incremento%6)*96;
		int my = (incremento%6)*96;
		
		g2d.drawImage(img, 200, 200, 200+96, 200+96, mx, my,mx + 96, my+96, this);
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[]argas) {
		
		new Sprite().setVisible(true);
		
	}

}
