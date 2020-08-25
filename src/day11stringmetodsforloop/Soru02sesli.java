package day11stringmetodsforloop;

import java.util.Scanner;

public class Soru02sesli {

	public static void main(String[] args) {
    //Girilen string deki tum sesli harfleri yazan bir program
		Scanner scan = new Scanner (System.in);
        System.out.println("bir kelime giriniz");
        String str =scan.next();
        System.out.println(sesliHarf( str));
        scan.close();
	}
     public static int sesliHarf(String str) {
		String a="a,e,u,i,o,";
		int count =0;
		for (int i = 0; i < str.length()-1; i ++) {
			for (int j = 0; j < a.length()-1; j++) {
				if(str.charAt(i)==a.charAt(j)) {
					count++;}
			}
		}
		return count;

	}

}
