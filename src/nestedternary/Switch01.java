package nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
        char ch = scan.next().charAt(0);
        
        
        if ( ch=='a' || ch=='A')
        	{System.out.println("�lk harf");

        	}else if( ch=='b' || ch=='B')
            	{System.out.println("�kinci harf");
            	
            	}else if( ch=='c'|| ch=='C')
            		
                	{System.out.println("���nc� harf");	
                	}else {System.out.println("Tan�mlanamd�");
                	
            	}
	}

}
