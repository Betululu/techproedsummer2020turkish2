package nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay giriniz");
        String ay = scan.next();
         
        //Kullan�c� ay ism�n� girince o ay�n mevsimini yaz�n
        
       switch (ay) {
       case "Aral�k":
       case "Ocak":
       case "Subat":
    	   System.out.println("K�s");
           break;
       case"Mart":
       case"Nisan":
       case"May�s":
    	   System.out.println("�lkbahar");
    	   break;
       default:
    	   System.out.println("Gecersiz");
       }
       scan.close();
	}

}
