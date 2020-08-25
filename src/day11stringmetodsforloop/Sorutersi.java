package day11stringmetodsforloop;

import java.util.Scanner;

public class Sorutersi {

	public static void main(String[] args) {
		// iki basamakli sayinin tersinin kendisinden buyukluk durumunu kontrol eden methodu yaziniz
		
		Scanner scan=new Scanner (System.in);
		System.out.println("iki basamakli sayiyi giriniz");
        int sayi=scan.nextInt();
         System.out.println(sayiTersi(sayi));
	}
      public static boolean sayiTersi(int sayi) {
    	  int result=0;
		 int a=sayi%10;
		 int b=sayi/10;
		 result=a*10+b;
		 System.out.println(result);
    	  if(result>sayi) {
    		  return true;
    	  }else {
    		  return false;
    	  }
    	  
    	  
	}
}
