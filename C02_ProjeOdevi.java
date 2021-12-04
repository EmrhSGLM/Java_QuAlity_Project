package day01_gitupProjeOdevi;

import java.util.Scanner;

public class C02_ProjeOdevi {

	public static void main(String[] args) {
		/******
		 * Tugba Hanim ***** Pozitif bir int num verildiðinde, return edildiði zaman num
		 * tamkare ise true veren deðilse false veren bir fonksiyon yazýn.
		 * 
		 *          Not: sqrt gibi fonksiyonlarý kullanmayýn.
		 * 
		 * Example 1: Input: 16 Output: true Not: bu sayý tamkare çünkü 4*4 = 16
		 * 
		 * Example 2: Input: 25 Output: true Note: bu sayý tamkare çünkü 5*5=25
		 * 
		 * 
		 * Example 3: Input: 14 Output: false
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif sayi giriniz");
		int sayi = scan.nextInt();
       
		if (sayi <= 0) {
			System.out.println("Yalnis sayi girdiniz pozitif bir sayi girin lutfen");
		}
		for (int i = 1; i <= sayi; i++) {
            
           
		if (sayi==i*i) {
			System.out.println(true);
			System.out.println("bu sayi tam kare cunku " + i + "*" + i + "=" + sayi);
			break;
		} else  if(sayi==i){
			System.out.println(false);
			break;


		}
	}
}
	
}
