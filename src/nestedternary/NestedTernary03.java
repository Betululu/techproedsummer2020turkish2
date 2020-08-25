package nestedternary;

import java.util.Scanner;

public class NestedTernary03 {

	public static void main(String[] args) {
		// Kullanicidan bir charekter aliniz eger charakter harf ise harf yazdir degilse
		//harf defgildir yazdir
		Scanner scan =new Scanner (System.in);
		System.out.println("bir charekter giriniz");
       char ch =scan.next().charAt(0);
        
        String result = (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ? "Harf" : "Harf degildir";
        System.out.println(result);
        scan.close();
	}

}
