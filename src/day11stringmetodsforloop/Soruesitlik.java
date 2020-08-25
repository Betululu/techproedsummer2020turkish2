package day11stringmetodsforloop;

import java.util.Scanner;

public class Soruesitlik {

	public static void main(String[] args) {
		// iki integer sorusunun esitligini kontrol eden methot
		Scanner scan = new Scanner (System.in);
        System.out.println("iki numara giriniz");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println(isEquels(num1,num2));
	}
     public static boolean isEquels(int num1,int num2) {
		if(num1==num2) {
			return true;
		}else {
			return false;
		}
	}
}
