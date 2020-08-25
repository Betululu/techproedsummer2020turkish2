package day11stringmetodsforloop;

import java.util.Scanner;

public class Soruciftlik {

	public static void main(String[] args) {
      //bir ciflikte tavuk inek ve kecilerin ayak sayilarinin toplami
		Scanner scan = new Scanner (System.in);
        System.out.println("tavuk sayisini giriniz");
        int tavuk=scan.nextInt();
        System.out.println("inek sayisini giriniz");
        int inek=scan.nextInt();
        System.out.println("keci sayisini giriniz");
        int keci=scan.nextInt();
        System.out.println(ayakSayisi(tavuk,inek,keci));
	}
     public static int ayakSayisi(int tavuk,int inek,int keci) {
		
    	 int result=0;
    	 result=(tavuk*2 + inek*4 + keci*4);
    	 
    	 
    	 
    	 
    	 return result;
		
	}
}
