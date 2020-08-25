package ifstatement;

import java.util.Scanner;

public class IfElse01Harf {

	public static void main(String[] args) {
		
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");
		char harf = scan.next().charAt(0);
		 
		if(harf=='a' ||  harf =='A')   {
			
			System.out.println("Ýlk harf");
			
		}else if(harf=='b' || harf=='B' ) {
			
			System.out.println("Ýkinci harf");
			
		} else if(harf=='c' ||  harf=='C') {
			  
			System.out.println("Üçüncü harf");}
		
			else {
				System.out.println("Sýrasýný bilmiyorum");
				
			}	
		scan.close();

	}

}
