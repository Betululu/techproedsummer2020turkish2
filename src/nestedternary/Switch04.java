package nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay giriniz");
        String ay = scan.next();
         
        //Kullanýcý ay ismýný girince o ayýn mevsimini yazýn
        
       switch (ay) {
       case "Aralýk":
       case "Ocak":
       case "Subat":
    	   System.out.println("Kýs");
           break;
       case"Mart":
       case"Nisan":
       case"Mayýs":
    	   System.out.println("Ýlkbahar");
    	   break;
       default:
    	   System.out.println("Gecersiz");
       }
       scan.close();
	}

}
