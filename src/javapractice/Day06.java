package javapractice;

import java.util.Scanner;

public class Day06 {

	public static void main(String[] args) {
		// kullanicidan bir kelime grubu isteyelim ve kelime sayisini cikaralim
		Scanner scan =new Scanner (System.in);
		System.out.println("kelime grubu giriniz");
        String  str =scan.nextLine();
         System.out.println("kelime sayisi:"+kelimeSayisi(str));
         scan.close();
       }
       public static int kelimeSayisi(String  str) {
    	   int count =0;
    	   
    	   for(int i=0;i<str.length()i++) {
    		 
    		 if(str.charAt(i)==' ') {
    			 count++
    		 }
    	   }
    	   count=count+1;
    			   return count
       }
}

