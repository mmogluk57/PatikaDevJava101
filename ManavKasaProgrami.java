package PatikaDev;

import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		
		
		
		Scanner scn= new Scanner(System.in);
		
		System.out.print("Armut Kac Kilo ?: ");
		int armut = scn.nextInt();	
		
		System.out.print("Elma Kac Kilo ?: ");
		int elma = scn.nextInt();
		
		System.out.print("Domates Kac Kilo ?: ");
		int domates = scn.nextInt();
		
		System.out.print("Muz Kac Kilo ?: ");
		int muz = scn.nextInt();
		
		System.out.print("Patlican Kac Kilo ?: ");
		int patlican = scn.nextInt();
		
	
		double toplam = armut *2.14 + elma * 3.67 + domates * 1.11 + muz*0.95 + patlican*5;
		System.out.println("Toplam tutar: " + toplam);
		

	}

}
