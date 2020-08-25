package javapractice;

import java.util.Scanner;

public class Day05 {
	public static void main(String[] args) {
		//kullanicidan bolunen ve bolen seklinde 2 sayi alalimve bolme opperatoru
		//kullanmdan bolme islemini gerceklestirelim.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bolunen giriniz");
		int bolunen =scan.nextInt();
		System.out.println("Bolen giriniz");
		int bolen = scan.nextInt();
		 int bolum =0;
		 while(bolunen>=bolen) {
			 
			 bolunen-=bolen;
			 
			 bolum++; 
		 }
		System.out.println("sonuc:"+ bolum);
		
		scan.close();
	}

}
