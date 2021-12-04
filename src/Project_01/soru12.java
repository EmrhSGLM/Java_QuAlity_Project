package proje_Sorulari;

import java.util.Scanner;

public class soru12 {

	public static void main(String[] args) {

		/**
		 * Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .
		 * 
		 * Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı
		 * olan harflerin birisini kaldırın
		 * 
		 * Örnek: "abc", "cat" --> "abcat" "abc", "dog" -->"abcdog"
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen  ilk kelimeyi giriniz : ");

		String kelime1 = scan.nextLine();

		System.out.println("lutfen  ikinci ikinci giriniz : ");

		String kelime2 = scan.nextLine();

//		

		if (kelime1.charAt(kelime1.length() - 1) == kelime2.charAt(0)) {

			// System.out.println(isim1.substring(0, isim1.length()-1)+isim2);
			System.out.println(kelime1 + kelime2.substring(1, kelime2.length()));

		} else {
			System.out.println(kelime1 + kelime2);
		}
	}

}
