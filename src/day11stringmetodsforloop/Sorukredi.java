package day11stringmetodsforloop;

import java.util.Scanner;

public class Sorukredi {

	public static void main(String[] args) {
		// kredi kartinin son 4 hanesini yazdiran method 
		Scanner scan=new Scanner (System.in);
		System.out.println("kredi kartinin nosunu giriniz");
        String str=scan.next();
        System.out.println(kartNo(str));
	}
       public static String kartNo(String str) {
		   String a=str.replaceAll("\\w", "*");
    	   String b=str.substring(12);
    	   
    	   
    	   return a+b;
	}
}
