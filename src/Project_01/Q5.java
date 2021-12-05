package githup_Proje;

import java.util.Iterator;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*
		 * Scanner class aracýlýðýyla girilen herhangi bir sayýnýn faktöriyel deðerini
		 * bulmak için bir program yazýn.
		 * 
		 * number:6 factorial:1*2*3*4*5*6=720 output ---> 720
		 */

		
		Scanner scan=new Scanner (System.in);
		System.out.println("Bir tam sayi giriniz: ");
		
		int sayi=scan.nextInt();
		
		int faktoriyel=1;
		
		System.out.print(sayi + "!=");
		for (int i =1; i < sayi; i++) {
			faktoriyel*=i;
		
			System.out.print(i + "*");
			
			
		}
		faktoriyel*=sayi;
		System.out.print(sayi + "=" + faktoriyel);
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Scanner scan=new Scanner(System.in);
		 * System.out.println("Bir tam sayý giriniz");
		 * 
		 * int sayi=scan.nextInt();
		 * 
		 * int faktoriyel=1; System.out.print(sayi+"!=");
		 * 
		 * for (int i = 1; i < sayi; i++) { faktoriyel*=i;
		 * 
		 * System.out.print(i + "*");
		 * 
		 * } faktoriyel*=sayi; System.out.print(sayi +"=" + faktoriyel);
		 */
	}

}
