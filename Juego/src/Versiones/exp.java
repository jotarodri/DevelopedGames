package Versiones;

import java.util.Scanner;

public class exp {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);	
		
		String name = "Kuro";

		int nivel       =1;
		int exp         =0;
		int totaldExp   =1000;
		int total       =totaldExp; 
		int calculo     =0;
		//
		int expMonstruo =sc.nextInt();

		System.out.println("Has matado un monstruo y recibiras "+expMonstruo+" de exp.");
		exp+=expMonstruo;

		while (true) {

			if (exp<totaldExp) {

				break;

			} else {

				if (exp>=totaldExp) {

					exp-=totaldExp;
					nivel++;
					totaldExp= totaldExp * 30;
					totaldExp=totaldExp / 100;
					totaldExp+=total;
					total=totaldExp;

				}

			}
					
		}
		System.out.println(nivel);
		
		System.out.println(totaldExp);
		System.out.println(total);
		System.out.println(exp);
		
		System.out.println("Se acabo");
	}
}
