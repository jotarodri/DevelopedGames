package Versiones;

import java.util.Random;
import java.util.Scanner;

public class turnos_y_boss {
	
	public static int [][] matrizBosses (){
		
		String [][] matrizBosses=new String [][] {{"1","Ivan-samaneitor"},{"2","ElAdri"},{"3","ElDopeOCHO!"}};
		
		
		
		return matrizBosses();
		
	}
	
	public static void vidaMostrar (String caracter, String pj, String boss, int vidaBoss, int vidaPj) {
		
		System.out.println(pj+" = "+vidaPj);
		for (int i = 0; i < vidaPj/5; i++) {

			System.out.printf("%s",caracter);

		}
		System.out.printf("%n");

		
		System.out.println(boss + " = " + vidaBoss);
		for (int i = 0; i < vidaBoss/5; i++) {

			System.out.printf("%s",caracter);

		}
		System.out.printf("%n");

	}
	
	public static void menuRPG () {
		System.out.println("||--------------Que quieres hacer----------------||");
		System.out.println("|| - Atacar - - Defender - - Magia - - Objetos - ||");		
		System.out.println("||----- --------/////////////////----------------||");
	}
	
	public static void menuObjetos () {
		
		System.out.println("||---------------Que quieres usar----------------||");

		System.out.println("||----- --------/////////////////----------------||");

		
	}

	public static void main(String[] args) {

		//TODO hacer los bosses
		//TODO hacer critico
		
		Scanner sc=new Scanner(System.in);
		
        Random rnd=new Random();
        
        String caracter = "=";
		
		String pj 	= "Kuro";
		String boss = "Bic";
		String eleccion;
		
		/*Variables del personaje*/
		
		int ataqueOrigPers=20;
		int ataquePers=ataqueOrigPers;
		int defensaPJ = 10;/*al ataque se le rensta la defensa*/
		//
		int vitPJ  = 300;
		int manaPJ = 100;
		int exp=0;
		int nivel=1;
		int cantidadExp=2000;//ir subiendo un 30% si sube de nivel;
		/*                       */
		
		/*Variables del boss*/
		
		int ataqueOrigBoss = 10;
		int ataqueBoss=ataqueOrigBoss;
		int defensaBoss = 30;/*al ataque se le rensta la defensa*/
		//
		int vitBoss  = 300;
		int manaBoss = 100;
		/*                        */

		int numero;
		
		int contador=0;
		
		
		
		/*
		
		
		menuRPG();
		System.out.println("");
		
		menuObjetos();
		System.out.println("");
		
		items();
		
		*/

		
		do {
			
			do {
				
				
				vidaMostrar(caracter,pj,boss,vitBoss,vitPJ);
				
				System.out.println("");
				
				menuRPG();
								
				eleccion=sc.nextLine();
				eleccion=eleccion.toLowerCase();

				if (eleccion.equals("atacar")) {
					
					System.out.println("Atacas al boss");
					System.out.println("");
					
					vitBoss-=ataquePers;
					break;

				}else {
					
					if (eleccion.equals("defender")){
						
						ataqueBoss/=2;
						
					
					}else {
						
						System.out.println("Te has equivocado");
						
						
					}

				}
				
				ataquePers=ataqueOrigPers;
					
				
			}while (true);
			
			//turno del boss
			
			System.out.println("\nTurno del boss");
			
			
			/**/numero=(int) (Math.random() * 5) + 1;;//random
			
						
			//para visualizar el numero del boss//System.out.println(numero);
			
			if (numero==0||numero==2) {
				
				vitPJ-=ataqueBoss;
				System.out.println("El boss a atacado.");
				
			}else {
				
				if (numero==4||numero==1) {
					
					System.out.println("El boss se defiende");
					
					ataquePers/=2;
					
				}else {
					
					System.out.println("Se ha dormido");
					
				}
				
			}
			
			ataqueBoss=ataqueOrigBoss;
	

		}while (!(vitBoss==0||vitPJ==0));
		
		
		if (vitBoss<=0) {

			System.out.println("Has derrotado a "+ boss);

		}else {

			System.out.println("Te ha derrotado "+boss+" lo siento "+pj );

		}



	}

}
