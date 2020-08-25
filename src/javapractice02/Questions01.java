package javapractice02;

import java.util.Scanner;

public class Questions01 {

	public static void main(String[] args) {
		
		
		 Scanner scan=new Scanner (System.in);
		 System.out.println("bir kelime giriniz");
		String str=scan.next();
	      StringSutun(str);
		}
	    public static void StringSutun(String str) {
	    	System.out.println(str);
	    	for(int i =0;i<str.length();i++) {
	    		System.out.print(str.charAt(i));
	    		System.out.print(" ");
	    	}
	}

}
