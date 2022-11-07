package PatikaDev;

import java.util.Scanner;

public class CalculateAreaOfTriangle {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("1.Kenari giriniz: ");
		a = scn.nextInt();
		
		System.out.print("2.Kenari giriniz: ");
		b = scn.nextInt();
		
		System.out.print("3.Kenari giriniz: ");
		c = scn.nextInt();
		
		int u = (a+b+c)/2;
		
		double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Ucgenin alani: "+ area);

	}

}
