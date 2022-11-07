package PatikaDev;

import java.util.Scanner;

public class DaireDilim {

	public static void main(String[] args) {
		
		int r,a;
		double pi = 3.14;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Dairenin yari capini giriniz: ");
		r=scn.nextInt();
		System.out.print("Merkez aci olcusu giriniz: ");
		a=scn.nextInt();
		double daireDilim = pi*r*r*a/360;
		System.out.println("Daire diliminin alani: "+ daireDilim);

	}

}
