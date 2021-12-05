package Odev;

import java.util.Scanner;

public class Q1_Soru {
		
public static void main(String[] args) {
	/*Eðer age 10 dan küçük veya eþit ise
    facebook hesabi acmak icin cok gencsin print yapýn.

    Eðer age 16 dan küçük veya eþit ise
    ehliyet almak icin cok gencsin print yapýn.

    Eðer age 18 den küçük veya eþit ise
    dovme yaptirmak icin cok gencsin print yapýn.

    Eðer age 21 den küçük veya eþit ise
    alkol icmek icin cok gencsin print yapýn.

    Eðer age 21 den büyük ise
    istedigini yapabilirsin print yapýn.
    Not : Note: if else kullanarak cozum yapiniz.
    */
	
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen yasinizi Giriniz");
		int age =scan.nextInt();
		
		if (age<=10) {
			System.out.println("facebook hesabi acmak icin cok gencsin==>" +age);
			
		} else if(age<=16){
			System.out.println("ehliyet almak icin cok gencsin==>" +age);
			
		}else if(age<=18){
			System.out.println("dovme yaptirmak icin cok gencsin==>" +age);
			
		}else if(age<=21){
			System.out.println("alkol icmek icin cok gencsin==>" +age);
			
		}else if(age>21){
			System.out.println("istedigini yapabilirsin==>" +age);
	}
		scan.close();
}

}


