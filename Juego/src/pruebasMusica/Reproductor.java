package pruebasMusica;

import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;

public class Reproductor {
	
	private BasicPlayer player;

	public Reproductor() {
		
		this.player = new BasicPlayer();
	}
	
	//metodos
	
	public void Play() throws Exception {
		  player.play();
		}
		 
		public void AbrirFichero(String ruta) throws Exception {
		  player.open(new File(ruta));
		}
		 
		public void Pausa() throws Exception {
		  player.pause();
		}
		 
		public void Continuar() throws Exception {
		  player.resume();
		}
		 
		public void Stop() throws Exception {
		  player.stop();
		}

}
