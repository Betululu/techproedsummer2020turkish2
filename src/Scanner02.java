import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("tam isminizi giriniz");
	     String tamisim = scan.nextLine();
	     
     
     System.out.println("Yasinizi giriniz");
     int yas = scan.nextInt();
     System.out.println(yas);
     
     System.out.println("Isminizýn ilk harfini girin");
     char ilkHarf = scan.next().charAt(0);
     System.out.println(ilkHarf);
		
		
	}

}
