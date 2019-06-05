package dominio;

public class Criatura extends Personaje {
	
	private int nivelDeAsco;
	
	
	public Criatura() {
		
		
	}
	
	public Criatura (String nombre, String procedencia, int nivel, int defensaPropia, int fuerzaPropia, int vitalidadPropia, int contador, int critico, String imagen, String clase, int nivelDeAsco) {
		super(nombre, procedencia, nivel, defensaPropia, fuerzaPropia, vitalidadPropia, contador, critico, imagen, clase);

	}

}
