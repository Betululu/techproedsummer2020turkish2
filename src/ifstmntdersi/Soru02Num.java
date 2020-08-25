package ifstmntdersi;

import java.util.Scanner;

public class Soru02Num {

	public static void main(String[] args) {
		// Kullanicidan 2 tane sayi alalim ve bunlarin birbirleriyle olan
		//durumunu karsilastiralim
		
		/*12 15
		 * num1<num2
		 * num1>num2
		 * num1=num2
		 * num1<=num2
		 * num1>=num2
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen 1.sayiyi giriniz");
		int num1 = scan.nextInt();
		System.out.println("Lutfen 2.sayiyi giriniz");
		int num2 = scan.nextInt();	
		
		if(num1==num2) {
			System.out.println(num1 +"="+ num2);
		}if(num1!=num2) {
			System.out.println(num1+"!="+num2);
		}if(num1<num2) {
			System.out.println(num1+"<"+num2);
		}if(num1<=num2) {
			System.out.println(num1+"<="+num2);
		}if(num1>num2) {
			System.out.println(num1+">"+num2);
		}if(num1>=num2) {
			System.out.println(num1+">="+num2);
		}
		
		
		

	}

}
