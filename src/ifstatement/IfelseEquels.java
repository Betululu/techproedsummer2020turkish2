package ifstatement;

import java.util.Scanner;

public class IfelseEquels {

	public static void main(String[] args) {
     /*Kullanicidan bir gun alin 
      * Eger gun "Cuma" ise ekrana"Muslumanlar icin kutsal gun"yazdirin
      *  Eger gun "Cumartesi" ise ekrana"Hiristiyanlar icin kutsal gun"yazdirin
      *  Eger gun "Pazar" ise ekrana"Yahudiler icin kutsal gun"yazdirin
      */
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz");
		String gun = scan.next();
		
		if(gun=="Cuma") {
			System.out.println("Muslumanlar icin kutsal gun");
		}
		if(gun.equals("Cumartesi")) {
			System.out.println("Hiristiyanlar icin kutsal gun");
		}
		if(gun.equals("Pazar")) {
			System.out.println("Yahudiler icin kutsal gun");
		}
		
		scan.close();
		
		
		
		
	}

}
