package Odev;

import java.util.Scanner;

public class Q2_Soru {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
	/*	Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et

        Eğer number çift ise  print true

        Eğer number tek ise  print false

        Sonuc true ya da false olmalı.
        */

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen sayi Giriniz");
		int sayi =scan.nextInt();
		
			
		if(sayi%2==0) {
		
		System.out.println("Eğer number çift ==>"+(sayi%2==0));
		 
		}
		if(sayi%2==1) {
		System.out.println("Eğer number tek ==>"+(sayi%2==0));
		}	
	}

}
