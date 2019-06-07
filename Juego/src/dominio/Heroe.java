package dominio;

public class Heroe extends Personaje{

	//TODO hacer clase inventario?

	
	public Heroe (String nombre, String procedencia, int nivel, int defensaPropia, int fuerzaPropia, int vitalidadPropia, int contador, int critico, String raza, String clase) {
		super(nombre, procedencia, nivel, defensaPropia, fuerzaPropia, vitalidadPropia, contador, critico, raza, clase);
		
		
		numeroDeHeoresCreados++;
	}

	public Heroe() {
		// TODO Auto-generated constructor stub
	}
	
}
