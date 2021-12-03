package Project_01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
		 	Soru 10 : ***** Emrah Bey *****
		 	
					İki tane pozitif integer sayısı verildiğinde
				
				   	sayı 1 min degerinde
				
				   	sayı 2 max degerinde
				
				   	min ve max arasinda random sayi elde et(olustur)
			
			    	output veri tipi int olmali
		 */
		
		Scanner scan = new Scanner (System.in);
		
		int max=0;
		int min=0;
		
		for (int i = 1; i > 0 ; i++) {
			System.out.println("Please enter two numbers");
			//int num1=0;
			//int num2=0;
			int num1=scan.nextInt();
			int num2=scan.nextInt();			
			if (num1 > num2) {
				max=num1;
				min=num2;
				break;
			} else if (num2 > num1) {
				max=num2;
				min=num1;
				break;
			}else {
				System.out.println("Please enter differerent numbers");
			}
		}
		
		int rndm = (int) (min + (Math.random()*max));
		//int rndm = (int) a;
		
		System.out.println("Random number between "+ min+" to "+max+" ==> "+rndm);
		scan.close();
		

	}

}
