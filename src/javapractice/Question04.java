package javapractice;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// saat ve dakika girildiginde saniye return eden java metodu yaz
		//1  saat =3600sn
		//1 dakika =60sn
		Scanner scan = new Scanner(System.in);
		System.out.println("bir saat giriniz");
		int saat=scan.nextInt();
		System.out.println("dakika giriniz");
		int dakika=scan.nextInt();
		System.out.println("Saatin dakikaya donusmesi"+ SaniyeDonusturucu(saat,dakika)+"saniyedir");

	}
      public static int SaniyeDonusturucu(int saat,int dakika) {
    	  int saniye=(saat*3600)+(dakika*60);
          return saniye; 
      }
      
}
      