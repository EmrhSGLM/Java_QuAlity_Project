package t1.proje;

import java.util.Random;
import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		/*
		 * Soru 9 : ***** Zuhal Hanim ***** Veri tipi integer olan max sayýsý
		 * verildiðinde
		 * 
		 * 0 ile max sayisi arasindan random bir sayi elde et(olustur)
		 * 
		 * output tipi int olmalý
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("max sayýsýný giriniz");
		
		int max=scan.nextInt();
		
		Random r=new Random(); //random sýnýfý
		 int a=r.nextInt(max);//0 ve negatifler dahil deðil max da dahil deðil
		 
		 System.out.println(a);
		
		scan.close();	}

}
