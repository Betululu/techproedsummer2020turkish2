package javapractice;

import java.util.Scanner;

public class Stringmethod03 {

	public static void main(String[] args) {
		// Girileck olan @mail adresinin kuralalara uygun olup  olmadigini kontrol edelim
		//onkisim@sonkisim
		//" "
		//getemail dogrulama(string email)
		
		//return type = boolean
		
		Scanner scan =new Scanner (System.in);
		System.out.println("email adreslerini giriniz");
		String email =scan.next();
	System.out.println("Email:"+ getEmailDogrulama(email));
	}
    public static boolean getEmailDogrulama(String email) {
		if(!email.contains("@")) {
			return false;
		}if(email.length()<=4) {
				return false;
		}if(email.contains(" ")) {
					return false;
		}if(!email.contains(".")) {
				return false;
			}
			
			String[] arr=email.split("@");//abc@c.com arr[0]="abc"  arr[1]="c.com"
			
		
    	
    	
	
	
}
