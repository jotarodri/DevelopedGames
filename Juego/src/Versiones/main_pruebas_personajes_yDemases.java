package Versiones;

public class main_pruebas_personajes_yDemases {
	
	public static void monstrarContrato (PersonajeClass prueba) {
		
		System.out.println("Conntrato de aventurero");
		
		System.out.println("\nNombre: " + prueba.getNombre());
		System.out.println("\nOrigen: " + prueba.getOrigen());
		System.out.println("\nClase: " + prueba.getClase());
		System.out.println("\nSexo: " + prueba.getSexo());
		System.out.println("\nAtaque: "+prueba.getAtaque());
		System.out.println("\nVitalidad: "+prueba.getVitalidad());
		System.out.println("\nArma: "+prueba.getArma());
		System.out.println("\nArmadura: "+prueba.getArmadura());
		
		
		
	}

	public static void main(String[] args) {

		PersonajeClass principal = new PersonajeClass ("Kuro", "oscuridad","guerrero","hombre","Espada Espiritual","Placas",100,100);
		
		monstrarContrato(principal);
		
	}

}
