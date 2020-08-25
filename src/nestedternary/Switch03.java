package nestedternary;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay giriniz");
        int ay = scan.nextInt();
        
        
        
        switch (ay) {
        case 1:
            System.out.println("Ocak");
            break;
        case 2:
        	System.out.println("Þubat");
        	break;
        case 3:
        	System.out.println("Mart");
            break;
            default:
            	System.out.println("Geçersiz");
            
            
            
        }
       scan.close(); 

	}

}
