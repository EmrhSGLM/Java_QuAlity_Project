package day01_gitupProjeOdevi;

import java.util.Scanner;

public class C01_ProjeOdevi {

	public static void main(String[] args) {
		
        


/*Soru 8 : ***** Tugba Hanim *****
	Veri tipi int olan bir sayý verildiðinde

   	 0 dan baþlayarak verilen sayýya kadar olan tum cift sayýlarý print edin.

   	 Example 1:
    	int input = 10;

   	print  0 2 4 6 8 10  olmalý


    	Example 2:
    	int input = 15;

   	 print  0 2 4 6 8 10 12 14  olmalý*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int girilenSayi= scan.nextInt();
		int toplam=0;
		for (int i = 0; i <=girilenSayi; i++) {
			toplam+=i;
			
		if(i%2==0) {
			System.out.print(i + " ");
			
			
		} 
		
		}
		

	}

}
