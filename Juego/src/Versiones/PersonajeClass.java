package Versiones;

public class PersonajeClass {

	String nombre;
	String origen;
	String clase;
	String sexo;
	String arma;
	String armadura;
	private int ataqueInicial;
	int ataque;
	private int vitalidadInicial;
	int vitalidad;
	//TODO defensa
	//int defensaInicial;
	//int defensa;

	//Constructor por defecto pasandole los 6 parametros

	public PersonajeClass () {

		this("","","","","","",1,1);

	}

	public PersonajeClass(String nombre, String origen, String clase, String sexo, String arma, String armadura,
			int ataqueInicial, int vitalidadInicial) {
		super();
		this.nombre = nombre;
		this.origen = origen;
		this.clase = clase;
		this.sexo = sexo;
		this.arma = arma;
		this.armadura = armadura;
		this.ataqueInicial = ataqueInicial;
		this.ataque = this.ataqueInicial;
		this.vitalidadInicial = vitalidadInicial;
		this.vitalidad = this.vitalidadInicial;
	}

	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getArmadura() {
		return armadura;
	}

	public void setArmadura(String armadura) {
		this.armadura = armadura;
	}

	public int getAtaqueInicial() {
		return ataqueInicial;
	}

	public void setAtaqueInicial(int ataqueInicial) {
		this.ataqueInicial = ataqueInicial;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getVitalidadInicial() {
		return vitalidadInicial;
	}

	public void setVitalidadInicial(int vitalidadInicial) {
		this.vitalidadInicial = vitalidadInicial;
	}

	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}

	@Override
	public String toString() {
		return "PersonajeClass [nombre=" + nombre + ", origen=" + origen + ", clase=" + clase + ", sexo=" + sexo
				+ ", arma=" + arma + ", armadura=" + armadura + ", ataque=" + ataque + ", vitalidad=" + vitalidad + "]";
	}


	

	//-----------------------------------------------------


}




