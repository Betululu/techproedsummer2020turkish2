package ifstatement;

import java.util.Scanner;

public class IfElse01Harf {

	public static void main(String[] args) {
		
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir harf giriniz");
		char harf = scan.next().charAt(0);
		 
		if(harf=='a' ||  harf =='A')   {
			
			System.out.println("�lk harf");
			
		}else if(harf=='b' || harf=='B' ) {
			
			System.out.println("�kinci harf");
			
		} else if(harf=='c' ||  harf=='C') {
			  
			System.out.println("���nc� harf");}
		
			else {
				System.out.println("S�ras�n� bilmiyorum");
				
			}	
		scan.close();

	}

}
