package day11stringmetodsforloop;

import java.util.Scanner;

public class Soruarray {

	public static void main(String[] args) {
		// 2 sayi girelim 1.sayinin i 2. sayi kadar kendisi ile 
		//toplamindan olussun
		Scanner scan=new Scanner (System.in);
		System.out.println("bir sayi  giriniz");
        int num  =scan.nextInt();      
        System.out.println("array uzunlugu giriniz");
        int length =scan.nextInt();
       arrayUzunluk(num,length);
	}
	public static int arrayUzunluk(int num,int length) {
		int product=1;
		int[] arr=new int[length];
		for (int i = 0; i<=length-1; i++) {
			product=(num*i+num);
			arr[i]=(product);
			System.out.print(product+" ");
		}
		return product;
	}
	}


