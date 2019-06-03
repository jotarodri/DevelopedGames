package dominio;

public abstract class Personaje {
	
	public static int numeroDeHeoresCreados;//hay que ir aumentandolo por cada personaje
	public static int numeroDeBossesCreados;//hay que ir aumentandolo por cada boss
	public static int numeroDeNPCSCreados;//hay que ir aumentandolo por cada npc
	public static int numeroDeCriaturasCreados;//hay que ir aumentandolo por cada criatura
	
//-----------------------------------------------------------------------------------------------------
	
	protected String nombre;
	protected String procedencia;
	protected int nivel;
	protected int defensaPropia;
	protected int defensaTotal;
	protected int fuerzaPropia;
	protected int fuerzaTotal;
	protected int vitalidadPropia;
	protected int vitalidadTotal;
	protected int magia;
	protected int critico;
	protected String raza;
	protected String clase;
	protected String nivelMazmorra;
	
	/* CONSTRUCTOR POR DEFECTO
	 * 
	public Personaje(String nombre, String procedencia, int nivel, int defensaPropia, int fuerzaPropia, int vitalidadPropia, int magia, int critico, String raza, String clase) {
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
		this.magia = magia;
		this.critico = critico;
		this.raza = raza;
		this.clase = clase;
	}
	
	*/
	
	//----Getters de las variables estaticas
	
	public static int getNumeroDeHeoresCreados() {
		return numeroDeHeoresCreados;
	}
	public static int getNumeroDeBossesCreados() {
		return numeroDeBossesCreados;
	}
	public static int getNumeroDeNPCSCreados() {
		return numeroDeNPCSCreados;
	}
	public static int getNumeroDeCriaturasCreados() {
		return numeroDeCriaturasCreados;
	}
		
	//----Getters y algunos setters de las variables para personajes vacios;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getDefensaPropia() {
		return defensaPropia;
	}
	public void setDefensaPropia(int defensaPropia) {
		this.defensaPropia = defensaPropia;
	}
	public int getFuerzaPropia() {
		return fuerzaPropia;
	}
	public void setFuerzaPropia(int fuerzaPropia) {
		this.fuerzaPropia = fuerzaPropia;
	}
	public int getVitalidadPropia() {
		return vitalidadPropia;
	}
	public void setVitalidadPropia(int vitalidadPropia) {
		this.vitalidadPropia = vitalidadPropia;
	}
	public int getmagia() {
		return magia;
	}
	public void setmagia(int magia) {
		this.magia = magia;
	}
	public int getCritico() {
		return critico;
	}
	public void setCritico(int critico) {
		this.critico = critico;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	
	public void setNivelMazmorra(String nivelMazmorra) {
		this.nivelMazmorra = nivelMazmorra;
	}

	public String getNivelMazmorra() {
		return this.nivelMazmorra;
	}

	//metodos de la clase

	public void andar() {
		//TODO hacer algo como andar en este metodoS
	}

	public void atacar(Personaje p) {
		
	}

	public void defender(Personaje p) {

	}

}
