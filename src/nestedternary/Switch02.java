package nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gün giriniz");
        int day = scan.nextInt();
        
        
		switch (day)  {
			case 1:
			  System.out.println("Pazartesi");
			break;
			case 2:
		      System.out.println("Salý");
		    break;
			case 3:
				System.out.println("carsamba");
			break;
				default :
					System.out.println("Gecerli gun giriniz");
				
		    
		}
		
		scan.close();
		
		

	}

}
