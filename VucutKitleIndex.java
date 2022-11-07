package PatikaDev;

import java.util.Scanner;

public class VucutKitleIndex {

	public static void main(String[] args) {
		
		double kilo,boy;
		double index;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Lutfen boyunuzu(metre cinsiden) griniz: ");
		boy = scn.nextDouble();
		
		System.out.print("Lutfen kilonuzu giriniz: ");
		kilo = scn.nextDouble();
		
		index = kilo/ (boy*boy);
		System.out.println("Vucut kitle Indeksiniz: " + index);
		
		

	}

}
