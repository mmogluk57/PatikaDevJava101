package PatikaDev;

import java.util.Scanner;

public class CalculateKDV {

	public static void main(String[] args) {
		
		
		double tutar, kdvOran, kdvTutar, kdvliTutar;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the price: ");
		tutar = input.nextDouble();
		
		
		kdvOran = (tutar<=1000 ? 0.18 : 0.08);
		
		kdvTutar=tutar*kdvOran;
		
		kdvliTutar = kdvTutar+tutar;
	
		
		
		
		System.out.println("KDV'siz tutar: "+ tutar);
		System.out.println("KDV Orani:  " + kdvOran);
		System.out.println("KDV Tutari: " + kdvTutar);
		System.out.println("KDV'li Tutar:  " + kdvliTutar);

	}

}
