package ifstmntdersi;

import java.util.Scanner;

public class IfElseDortIslem {

	public static void main(String[] args) {
       /*Kullanicidan 4 islemdan birini sectirelim
        * toplama,cikartma,carpma,bolme
        * 2 sayi girsin
        * sonucu yazdiralim
        * toplama 5,6 "Toplama isleminin sonucu:5+6=11" 
        */
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen isleminizi seciniz.\ntoplama\ncikartma\ncarpma\nbolme");
		String islem = scan.next();
		System.out.println("Lutfen 2 sayiyi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		if(islem.equalsIgnoreCase("toplama")) {
			System.out.println("Toplama isleminin sonucu:" +num1+"+"+num2+"=" + (num1+num2));
			
		}else if(islem.equalsIgnoreCase("cikartma")) {
			System.out.println("Cikartma isleminin sonucu:" +num1+"-"+num2+"=" + (num1-num2));
			
		}else if(islem.equalsIgnoreCase("carpma")) {
			System.out.println("Carpma isleminin sonucu:" +num1+"*"+num2+"=" + (num1*num2));
			
		}else if(islem.equalsIgnoreCase("bolme")) {
			System.out.println("Bolme isleminin sonucu:" +num1+"/"+num2+"=" + (num1/num2));
			
		}else {
			System.out.println("Hatali secim");
	    }
		
		
		
		
		
		
		
	}

}
