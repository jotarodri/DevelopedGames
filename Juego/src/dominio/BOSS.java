package dominio;

public class BOSS extends Personaje{
	
	public BOSS (String nombre, String procedencia, int nivel, int defensaPropia, int fuerzaPropia, int vitalidadPropia, int contador, int critico, String raza, String clase) {
		super(nombre, procedencia, nivel, defensaPropia, fuerzaPropia, vitalidadPropia, contador, critico, raza, clase);
	
		numeroDeBossesCreados++;
	}

}
