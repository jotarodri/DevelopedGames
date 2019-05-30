package main_pruebas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class pruebas_main_guardar_cargar {

	public static void main(String[] args) {

		File archivo = new File("/home/daw/Escritorio");
		FileReader fr = null;
		try {
			fr = new FileReader(archivo);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		//...
		try {
			String linea = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
