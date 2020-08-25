import java.util.Scanner;

public class soru03 {

	public static void main(String[] args) {
		
		//Kullanýcýdan 3 basamaklý sayý alýnýz 
		//Bu sayýnýn rakamlarý toplamýný ekrana yazdýrýnýz

		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("3 basamaklý sayý giriniz");
		 
		 int s = scan.nextInt();
		 
		 int sonRakam = s%10;
		 
		 int ortaRakam = (s/10)%10;
				 
		int ilkRakam = (s/100)%10;
		
		 System.out.println(ilkRakam+ortaRakam+sonRakam);
		 
		 scan.close();
		
	}

}
