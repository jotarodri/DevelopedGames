package Versiones;

import java.util.ArrayList;
import java.util.TreeMap;

import javax.swing.JFrame;

public class inventario_TODO {

	public static String[][] items (String op) {
		
		/*decir que lista de items se necesita consultar*/
		
		/*hay que hacer un inventario que se pueda consultar siempre que se quiera*/

		String [][] ListaObjetos = new String [4][2];

		ListaObjetos[0][0] ="1";
		ListaObjetos[0][1] ="Elixir de vida";
		ListaObjetos[1][0] ="2";
		ListaObjetos[1][1] ="Elixir de mana";
		ListaObjetos[2][0] ="3";
		ListaObjetos[2][1] ="Elixir de fuerza";
		ListaObjetos[3][0] ="4";
		ListaObjetos[3][1] ="Elixir de defensa";

		return ListaObjetos;

	}

	public static void main(String[] args) {

		/*
		 * Al principio del juego te regalan 3 pociones de vida y 1 de mana
		 */
		
		String op = "";
		String [][] ListaDeItemsConsumibles = items(op);

		TreeMap<Integer,String> inventarioPersonaje = new TreeMap <Integer,String> (); 	}

}