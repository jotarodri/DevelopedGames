/**
 * @author Gaston Tomas Huete DAW1
*/
package Versiones;

import java.util.Scanner;

public class Juego_ {
	
	public static Scanner sc = new Scanner (System.in);

	public static void mensajeBienvenida () {

		System.out.println(" d888b  d888888b db   db d8888b. d88888b db    db d88888b db       .d88b.  d8888b. d88888b d8888b. \r\n" + 
				"88' Y8b `~~88~~' 88   88 88  `8D 88'     88    88 88'     88      .8P  Y8. 88  `8D 88'     88  `8D \r\n" + 
				"88         88    88ooo88 88   88 88ooooo Y8    8P 88ooooo 88      88    88 88oodD' 88ooooo 88oobY' \r\n" + 
				"88  ooo    88    88~~~88 88   88 88~~~~~ `8b  d8' 88~~~~~ 88      88    88 88~~~   88~~~~~ 88`8b   \r\n" + 
				"88. ~8~    88    88   88 88  .8D 88.      `8bd8'  88.     88booo. `8b  d8' 88      88.     88 `88. \r\n" + 
				" Y888P     YP    YP   YP Y8888D' Y88888P    YP    Y88888P Y88888P  `Y88P'  88      Y88888P 88   YD \r\n" + 
				"                                                                                                   \r\n" + 
				"                                                                                                   ");

		System.out.println("");	
		System.out.println("                    Gracias por jugar mi juego, es solo el inicio de algo grande...");
		System.out.println("");

	}

	public static void menuEntrada () {

		System.out.println("----------------------------------------------------------------");
		System.out.println("|      |  Start  |        | Personaje |       | Historia |      |");
		System.out.println("----------------------------------------------------------------");
		System.out.println("|                   Opciones  |  Exit                           |");
		System.out.println("----------------------------------------------------------------");
	}
	
	public static void menuStart () {
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("|                     Nueva Partida                             |");
		System.out.println("----------------------------------------------------------------");
		System.out.println("|                       Continuar                               |");
		System.out.println("----------------------------------------------------------------");
		
	}

	public static void opciones () {

		System.out.println("----------------------------------------------------------------");
		System.out.println("|                        Secret | Back                          |");
		System.out.println("----------------------------------------------------------------");


	}

	public static void personajes (String op) {

		if (op.equals("mujer")) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("| Eres un guerrera de la mas baja clase social, pero             |");
			System.out.println("| desde el dia en el que te nombraron caballero marco el punto de|");
			System.out.println("| partida de tu gran aventura...                                 |");
			System.out.println("| ï¿½Mucha suerte heroe!                                           |");
			System.out.println("-----------------------------------------------------------------");
		}else {
			if (op.equals("hombre")) {

				System.out.println("-----------------------------------------------------------------");
				System.out.println("| Eres un guerrero de la mas baja clase social, pero             |");
				System.out.println("| desde el dia en el que te nombraron caballero marco el punto de|");
				System.out.println("| partida de tu gran aventura...                                 |");
				System.out.println("| ï¿½Mucha suerte heroe!                                           |");
				System.out.println("-----------------------------------------------------------------");
			}
			else {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("| Eso no exoste en mi dimension, OPCION INCORRECTA.    		     |");
				System.out.println("| Prueba otra vez:                                               |");
				System.out.println("-----------------------------------------------------------------");
			}
		}
	}

	public static int preguntas () {

		int p1;
		int p2;
		int p3;
		int total = 0;
		String eleccion = " ";

		do {

			System.out.println("Dime el numero.");
			System.out.println("");
			System.out.println("Que te asusta mas:");
			System.out.println("1.Envejecer?");
			System.out.println("2.Ser diferente?");
			System.out.println("3.Ser indeciso?");
			p1=sc.nextInt();
			System.out.println("Que es mas importante:");
			System.out.println("4.Ser el numero uno.");
			System.out.println("5.La amistad?");
			System.out.println("6.Mis posesiones valiosas.");
			p2=sc.nextInt();
			System.out.println("Que quieres en la vida:");
			System.out.println("7.Ver lo que nadie a visto.");
			System.out.println("8.Ser como todo el mundo.");
			System.out.println("9.Ser fuerte.");
			p3=sc.nextInt();


			eleccion = p1 + "" + p2 + "" + p3;

			if (eleccion.equals("147")||(eleccion.equals("157"))||(eleccion.equals("148"))||(eleccion.equals("149"))||(eleccion.equals("167"))||(eleccion.equals("247"))||(eleccion.equals("347"))) {

				System.out.println("1");
				
				total= 10;


			}else {
				//normal
				if (eleccion.equals("257")||(eleccion.equals("357"))||(eleccion.equals("158"))||(eleccion.equals("159"))||(eleccion.equals("168"))||(eleccion.equals("249"))||(eleccion.equals("258"))||(eleccion.equals("259"))||(eleccion.equals("268"))||(eleccion.equals("348"))||(eleccion.equals("358"))) {

					System.out.println("2");
					total = 15;

				} else {
					//mas lento
					if (eleccion.equals("267")||eleccion.equals("367")||eleccion.equals("368")||eleccion.equals("169")||eleccion.equals("269")||eleccion.equals("349")||eleccion.equals("359")||eleccion.equals("369")) {

						System.out.println("3");
						
						total=25;

					} else {

						eleccion="000";
						System.out.println("Vuelve a intentarlo");
					}
				}



			}

		}while ((eleccion.equals("000")));

		return total;
	}
	
	public static void monstrarContrato (PersonajeClass personaje) {
		
		System.out.println("Conntrato de aventurero");
		
		System.out.println("\nNombre: " + personaje.getNombre());
		System.out.println("\nOrigen: " + personaje.getOrigen());
		System.out.println("\nClase: " + personaje.getClase());
		System.out.println("\nSexo: " + personaje.getSexo());
		System.out.println("\nAtaque: "+personaje.getAtaque());
		System.out.println("\nVitalidad: "+personaje.getVitalidad());
		System.out.println("\nArma: "+personaje.getArma());
		System.out.println("\nArmadura: "+personaje.getArmadura());
		
		
		
	}

	/*Â¡START TO THE GAME!*/

	public static void main(String[] args) {

		/* - Declaracion de variables del menu - */

		/*entrada*/Scanner sc = new Scanner(System.in);

		String op;
		String opOrigen;
		String opSexo;
		
		
		/* - Bienvenida GTHDeveloper - */
		mensajeBienvenida();
		/* - ----------------------- - */ 
		//Ahora variables del personaje para la creacion del personaje
		
		
		String sexo;/*chico o chica*/
		String clase;/*Actualmente guerrero, mago o arquero*/
		
		
		String nombrePrincipal = "";
		
		int ataqueInicial=100;
		int vitalidadInicial=155;
		boolean ok = false;
				
		String arma = "";
		String armadura = "";
		
		
		
		/*Cuando haya daños decimales recordad hacer casting a ¡int!*/
		
		//TODO Mirar como hacer la defensa del personaje
		
		//int defensaInicial;
		//int defensa;
		//
		/*Prueba para una futura tienda*/ int oro = 500;
		//
		/*contador para turno de jugador*/int contador;		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		/* - Menu hasta salida - */
		do {
			menuEntrada();
			
			System.out.printf("Dime tu eleccion: ");
			
			/*Opcion menu minusculas*/
			op=sc.nextLine();
			op=op.toLowerCase();
			/*----------------------*/
			
			System.out.println("");

			switch (op) {
			
			case "exit":
				
				System.exit(0);

			case "start":
				
				menuStart();
				
				op=sc.nextLine();
				op=op.toLowerCase();
				
				break;

			case "personaje":

				System.out.println("Dime tu sexo, Hombre o Mujer");

				op=sc.nextLine();
				op=op.toLowerCase();

				personajes(op);

				break;
			case "historia":

				break;

			case "opciones":

				/*do al menu de opciones*/do {

					/*MENU DE OPCIONES*/opciones();

					System.out.printf("Dime tu eleccion: ");
					/*Opcion menu minusculas*/
					op=sc.nextLine();
					op=op.toLowerCase();
					/*----------------------*/

				} while (!op.equals("back"));

				break;
				
			/*Opcion para cualquier error de entrada.*/

			default:

				System.out.println("No contemplo esa opcion, dime otra por favor.");

				break;
			}



		} while (!op.equals("nueva partida"));
		
		
		
		/*Ha elegido start, sale del do/while del menu y empieza el programa*/
		
		System.out.println("Has elegido comenzar tu aventura");
		
		/*Hacer el lore del principio de la historia*/System.out.println("");
		
		System.out.println("Ahora te hare una pregunta, ¿realmente quieres comenzar esta aventura?,\nsi empiezas, nunca podras volver atras... [si o no]");
		
		op = sc.nextLine();
		
		System.out.println("Muy bien, comencemos creado tu historia, de donde vienes, del lejano oriente,\n"
				+ "del las lejanas tierras blancas, de tierras oscuras y desconocidas al sur del mundo,\n"
				+ "de la capital del dinero y las riquezas o no lo sabes.\n");
		
		opOrigen=sc.nextLine();
		
		System.out.printf("Eres chico o chica: ");
		opSexo=sc.nextLine();
		opSexo=opSexo.toLowerCase();
		System.out.println("");
		
		if (opSexo.equals("chico")) {

			System.out.printf("Dime tu nombre aventurero: ");
			nombrePrincipal=sc.nextLine();
			
			
			/*TODO hacer algo de lore aqui*/System.out.println("");
			
			
			System.out.println("Muy bien " + nombrePrincipal + " dime que clase deseas ser:");
			
			System.out.printf("----------------------------------------------------------------------------"
					+ "\nClase guerrera, fuertes y duros pero un poco lentos."
					+ "\nClase exploradora, caracterizada por su velocidad."
					+ "\nClase magica, realmente fuertes pero debiles en combates extensos."
					+ "\n----------------------------------------------------------------------------"
					+ "\nAsi que dime aventurero, que quieres ser un guerrero, un mago"
					+ "\no un explorador."
					+ "\n----------------------------------------------------------------------------\n");
			
			clase=sc.nextLine();
			clase=clase.toLowerCase();
			
			//ok = true;
			
		} else if (opSexo.equals("chica")) {
				
				System.out.printf("Dime tu nombre aventurera: ");
				nombrePrincipal=sc.nextLine();
				
				
				/*TODO hacer algo de lore aqui*/System.out.println("");
				
				
				System.out.println("Muy bien " + nombrePrincipal + " dime que clase deseas ser:");
				
				System.out.printf("----------------------------------------------------------------------------"
						+ "\nClase guerrera, fuertes y duros pero un poco lentos."
						+ "\nClase exploradora, caracterizada por su velocidad."
						+ "\nClase magica, realmente fuertes pero debiles en combates extensos."
						+ "\n----------------------------------------------------------------------------"
						+ "\nAsi que dime aventurera, que quieres ser una guerrera, una maga"
						+ "\no una exploradora."
						+ "\n----------------------------------------------------------------------------\n");
				clase=sc.nextLine();
				clase=clase.toLowerCase();
				
				//ok = true;
				
			}else {
				
				/*cualñquier otra cosa*/
				
				System.out.println("Eso no se contempla en este universo, repitemelo porfavor.");
				
			}
		/*Hasta aqui hemos creado el personaje sin clase*/
		

		clase=sc.nextLine();
		clase=clase.toLowerCase();

		/* - Clases + aÃ±adidos a sus estadisticas + inicializacion del contador - */
		
		//No entra aqui
		
		if (clase.equals("guerrero")||clase.equals("guerrera")) {
			
			System.out.println("Elegiste ser un guerrero, se te otorgara una espada espiritual y una armadura de"
					+ "malla basica pero resistente."
					+ "El arma espiritual desaparecera cuando compres tu primera arma."
					+ "Te vuelves increiblemente fuerte pero sacrificas tu velocidad,"
					+ "pero te da igual.");
			
			contador=14;
			arma="Espada espiritual";
			armadura="Placas";


		}else if (clase.equals("arquero")||(clase.equals("arquera"))) {

			System.out.println("Elegiste ser un arquero, se te otorgara un arco espiritual y"
					+ "una armadura de cuero."
					+ "El arma espiritual desaparecera cuando compres tu primera arma."
					+ "Te vuelves mas rapido que nadie.");
			contador=6;
			arma="Arco espiritual";
			armadura="Cuero";

		}else if (clase.equals("mago")||(clase.equals("maga"))) {

			System.out.println("Elegiste ser un mago, se te otorgara un baston espiritual"
					+ "y una armadura de tela basica pero resistente."
					+ "El arma espiritual desaparecera cuando compres tu primera arma."
					+ "Te vuelves mas rapido y mas fuerte.");
			contador=8;
			arma="Baston espiritual";
			armadura="Tela";

		}

		System.out.println("Muy bien, este es tu contrato ->");

		PersonajeClass principal = new PersonajeClass(nombrePrincipal, opOrigen, clase, opSexo, arma, armadura,ataqueInicial,vitalidadInicial);


		monstrarContrato(principal);

	}

	
	
}
