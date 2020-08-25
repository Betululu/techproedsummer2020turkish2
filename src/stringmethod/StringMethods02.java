package stringmethod;

import java.util.Scanner;

public class StringMethods02 {

	public static void main(String[] args) {
		// 
		
		String a = "Java";
		String b = "Java";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Java gir");
		String c = scan.next();
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
		scan.close();
		
		String d = "java";
		String e = "Java";
		String f = "JAVA";
		System.out.println(d.equalsIgnoreCase(e));
		

	}

}
