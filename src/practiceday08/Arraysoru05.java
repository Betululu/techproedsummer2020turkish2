package practiceday08;

import java.util.Scanner;

public class Arraysoru05 {

	public static void main(String[] args) {
		// Kullanicidan harf girmesini isteyiniz Girilen harf sesli ise ekrana sesli yazsin 
		//degilse sezsiz yazsin 
		//girdigi deger harf harf  degilse yada bir degerden fazla ise hatali giris desin
		//test girilen harfin buyuk yada kucuk olduguna duyarlidir
		//sesli harfler a,e,i,u,o,
		 Scanner scan = new Scanner (System.in);
		 System.out.println("bir harf giriniz");
		 String in = scan.next().toLowerCase();
		   
		 boolean uppercase=in.charAt(0)>='A' && in.charAt(0)<='Z' ;
		 boolean lowercase=in.charAt(0)>='a'  && in.charAt(0)<='z';
		 
		 boolean sesli=in.equals("a") || in.equals("e") || in.equals("u") || in.equals("o") || in.equals("i");
		 
         if(in.length()>1) {
        	 System.out.println("tek karakter giriniz ");
         }else if(!(uppercase || lowercase)) {
        	 System.out.println("hatali giris yaptiniz");
        	 
         }else if(sesli) {
        	 System.out.println(in + "sesli harf");
         }else {
        	 System.out.println(in + "sessiz harf");
         }
	}

}
