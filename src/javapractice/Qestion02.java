package javapractice;

import java.util.Scanner;



public class Qestion02 {

	public static void main(String[] args) {
		// kullanicidan iki sayi girmesini ve islem secmesi istenecek
		//Tum islemler metodla yapilacak
		
      Scanner scan =new Scanner (System.in);
      System.out.println("1. sayiyi giriniz");
      double num1 = scan.nextDouble();
      System.out.println("2. sayiyi giriniz");
      double num2 =scan.nextDouble();
      System.out.println("Dort islemden birini seciniz toplama,cikarma,carpma, bolme");
      String islem = scan.next().toLowerCase();
      islem(islem,num1,num2);
       scan.close();
	} 
      public static void islem(String islem, double num1,double num2) {
    	  
    	 switch(islem) {
    	 case"toplama":
    		 toplama(num1,num2);
    		 break;
    	 case"cikarma":
    		 cikarma(num1,num2);
    		break;
    	 case"carpma":
    		 carpma(num1,num2);
    		 break;
    	 case"bolme":
    		 bolme(num1,num2);
    		 break;
    		 default:
    			 System.out.println("yanlis islem sectiniz");
    		 
    	 }
    	  
      }
          public static void toplama(double num1,double num2);{
        	  System.out.println("Toplama isleminin sonucu:" +(num1+num2));
          }
          
          public static void cikarma(double num1,double num2);{
        	  System.out.println("cikarma isleminin sonucu:" +(num1-num2));
          }
          
          public static void carpma(double num1,double num2);{
        	  System.out.println("carpma isleminin sonucu:" +(num1*num2));
          }
          
          public static void bolme(double num1,double num2);{
        	  System.out.println("bolme isleminin sonucu:" +(num1/num2));
          }
         
	

}
