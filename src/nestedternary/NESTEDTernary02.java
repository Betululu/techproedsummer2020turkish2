package nestedternary;

import java.util.Scanner;

public class NESTEDTernary02 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Üçgenin üç kenar uzunluðunu giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		
		String result = k1==k2 && k1==k3 ? k1+k2+k3>30 ? "Ne buyuksun" : "Normal"
				
				        :k1+k2+k3<20 ? "Ne küçüksün" :"Normal";
				        System.out.println(result);
		
		 scan.close();              

	}

}
