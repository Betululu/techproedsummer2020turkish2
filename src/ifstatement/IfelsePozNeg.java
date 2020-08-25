package ifstatement;

import java.util.Scanner;

public class IfelsePozNeg {

	public static void main(String[] args) {
        /*Kullanicidan bir sayi alin 
         * Sayi negatif ise ekrana "Negatif" yazdirin
         * Sayi pozitif ise ekrana "Pozitif" yazdirin
         * Sayi 0 ise  ekrana "Notr" yazdirin
         */
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("Pozitif");
		}
		if(num<0) {
			System.out.println("Negatif");
		}
		if(num==0) {
			System.out.println("Notr");
		}
		
		
	}

}
