package objects;

public class Criatura extends Personaje {
	
	private int nivelDeAsco;
	
	public Criatura() {
		
	}
	
	public Criatura (String nombre, String procedencia, int nivel, int defensaPropia, int fuerzaPropia, int vitalidadPropia, int contador, int critico, String raza, String clase, int nivelDeAsco) {
		super();
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.nivel = nivel;
		this.defensaPropia = defensaPropia;    //<- aqui se modificaran todos los valores reducciones o sumas y se restaurara desde arriba pero no divisiones
		this.defensaTotal = defensaPropia;     // <- echa solo para el sistema de combate
		this.fuerzaPropia = fuerzaPropia;      //<- aqui se modificaran todos los valores reducciones o sumas y se restaurara desde arriba pero no divisiones
		this.fuerzaTotal = fuerzaPropia;       // <- echa solo para el sistema de combate
		this.vitalidadPropia = vitalidadPropia;//<- aqui se modificaran todos los valores reducciones o sumas y se restaurara desde arriba pero no divisiones
		this.vitalidadTotal = vitalidadPropia; // <- echa solo para el sistema de combate
		this.contador = contador;
		this.critico = critico;
		this.raza = raza;
		this.clase = clase;
		this.nivelDeAsco = nivelDeAsco;
		
		numeroDeCriaturasCreados++;
	}

}
