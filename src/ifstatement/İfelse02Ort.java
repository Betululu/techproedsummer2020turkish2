package ifstatement;

import java.util.Scanner;

public class �felse02Ort {

	public static void main(String[] args) {
		/*
		 * Kullanicidan iki not aliniz 
		 * Ortalama =(not1 + not2)/2
		 * Ortalama 50 nin altinda ise "Kaldiniz"
		 * Ortalama 70 in altinda ise "C ile gectiniz"
		 * Ortalama 85 in altinda ise "B ile gectiniz"
		 * Ortalama 100 ve 100 un  altinda ise "A ile gectiniz"
		 * Diger durumlarda (Negatif ve 100 den buyuk)"Gecerli not giriniz"
		 */
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("�lk notu giriniz");
        int ilk = scan.nextInt();
       
        System.out.println("�kinci notu giriniz");
        int ikinci = scan.nextInt();
        double ort = (ilk+ikinci)/2;
        
        if(ilk<0 || ikinci<0) {
        System.out.println("Notlar negatif olamaz");	
        }else if (ort<50) {
        System.out.println("Kald�n�z");
        }else if(ort<70) {
        System.out.println("C ile gectiniz");
        }else if(ort<85) {
            System.out.println("B ile gectiniz"); 
        }else if(ort<=100) {
            System.out.println("A ile gectiniz");
        }
        
        
        
	}

}
