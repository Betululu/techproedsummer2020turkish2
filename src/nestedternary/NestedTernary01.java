package nestedternary;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int s = scan.nextInt();
		
         String result = s>0 ? s>9 ? "Sayi" : "Rakam" : s==0 ? "Rakam" : "Negatif degil";
 System.out.println(result);
		
		
		
		
		scan.close();
		
		
		
		
		
		
	}
	

}
