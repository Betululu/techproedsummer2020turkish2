package day10practice;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// Kullanicidan 5 adet sayi girmesini isteyeklim ve 
		//bu sayilari bir array de toplayalim
		//icindeki cift sayilarin sayisini yazdiralim

		Scanner scan = new Scanner (System.in);
		System.out.println("5 adet sayi giriniz");
		int [] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()} ;
		int count =0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0) {
				count++;
			}
		}
		System.out.println("Girilen sayilradaki cift  sayi:"+count);
		
		
		
		
	}

}
