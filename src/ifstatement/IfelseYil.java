package ifstatement;

import java.util.Scanner;

public class IfelseYil {

	public static void main(String[] args) {
		/*Kullanicidan bir yil girmesini isteyelim
		 * Eger yil 1000 e bolunuyorsa ekrana "Milenyum" yazdirin
		 * Eger yil 100 e bolunuyorsa ekrana "Yuzyil" yazdirin
		 * Eger yil 10 e bolunuyorsa ekrana "Onyil" yazdirin
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz");
		int yil = scan.nextInt();
		
		if(yil%1000==0) {
			System.out.println("Milenyum");
		}else if(yil%100==0) {
			System.out.println("Yuzyil");
		}else if(yil%10==0) {
			System.out.println("Onyil");
		}else {
			System.out.println("Hicbiri");
		}
		scan.close();
	}

}
