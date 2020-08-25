package javapractice;

import java.util.Scanner;

public class Questions01 {

	public static void main(String[] args) {
		// klavyeden girilen bir cumlede bir harfin tekrar sayisini bulalim
		//bugun hava sicak//3 a var
		Scanner scan=new Scanner (System.in);
		System.out.println("bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("tekrarlayacak harfi gir");
		String harf=scan.next();
		
		
	
	
		int harfSayisi=0;
		for(int i=0;i<cumle.length();i++) {
			if(cumle.substring(i, i+1).equals(harf)) 
				harfSayisi++;
			
		}
		System.out.println(harf + "harfi" + harfSayisi + "defa tekrar etmistir");
	}
}
