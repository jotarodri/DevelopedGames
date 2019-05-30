package main_pruebas;

import objects.Personaje;

public class main_pruebas_creacionObjetos {

	public static void main(String[] args) {

		//(es abstracto por eso no se ) - Personaje n = new Personaje ("a",1,1,1,1);
/*		
		Heroe n1 = new Heroe ("a",1,1,1,1);
		Heroe n2 = new Heroe ("a",1,1,1,1);
		Heroe n3 = new Heroe ("a",1,1,1,1);
		Heroe n4 = new Heroe ("a",1,1,1,1);
		Heroe n5 = new Heroe ("a",1,1,1,1);
		
		NPC n7 = new NPC ("a",1,1,1,1);
		NPC n8 = new NPC ("a",1,1,1,1);
		NPC n10 = new NPC ("a",1,1,1,1);
		
		BOSS n11 = new BOSS ("a",1,1,1,1);
		BOSS n12 = new BOSS ("a",1,1,1,1);
		BOSS n14 = new BOSS ("a",1,1,1,1);
		BOSS n15 = new BOSS ("a",1,1,1,1);
		
		Criatura n16 = new Criatura ("a",1,1,1,1);
*/		
		System.out.println("boss- " + Personaje.numeroDeBossesCreados);
		System.out.println("criaturas- " + Personaje.numeroDeCriaturasCreados);
		System.out.println("npc- " + Personaje.numeroDeNPCSCreados);
		System.out.println("heroes- " + Personaje.numeroDeHeoresCreados);
		
		
	}

}
