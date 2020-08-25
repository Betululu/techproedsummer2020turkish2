package ifstmntdersi;

import java.util.Scanner;

public class Soru01Yas {

	public static void main(String[] args) {
      //Kullanicidan yasini ve kilosunu alalim
	  //18 yasinda kucuk ise kan bagisi yapamaz
	  //18 yasindan buyuk ve 50 kilodan hafif ise kan bagisi yapamaz
	  //18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println("Lutfen kilonuzu giriniz");
		int kilo = scan.nextInt();
		
		if(yas>18) {
			if(kilo>50)
			System.out.println("Kan verebilirsiniz");
		}else {
			System.out.println("18 yasindan kucukler kan bagisi yapamaz");
		}
	
	scan.close();
	
	}

}
