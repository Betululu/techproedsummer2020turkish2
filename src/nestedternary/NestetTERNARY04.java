package nestedternary;

import java.util.Scanner;

public class NestetTERNARY04 {

	public static void main(String[] args) {
		// kULLANICIDAN BIR SAYI ILIN TEK ISE KARESINI CIFT ISE YARISINI EKRANA YAZDIRIN
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int  sayi = scan.nextInt();
		
		int result = sayi%2==0 ? sayi/2 :  sayi*sayi ;
		
			System.out.println(result);
			
		scan.close();
	}

}
