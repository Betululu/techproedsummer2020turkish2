package day10practice;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// klavyeden girilecek plaka numarasindan ili gosteren uygulamayi yazlim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Il plaka numarasi giriniz");
       int plaka =scan.nextInt();
       String Sehirler[]= {"","Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara",
               "Antalya", "Artvin", "Ayd�n", "Bal�kesir", "Bilecik", "Bing�l", "Bitlis",
               "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum", "Denizli",
               "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir",
               "Gaziantep", "Giresun", "G�m��hane", "Hakkari", "Hatay", "Isparta",
               "��el (Mersin)", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
               "K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa",
               "K.mara�", "Mardin", "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize",
               "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda�", "Tokat", "Trabzon",
               "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
               "Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan",
               "I�d�r", "Yalova", "Karab�k", "Kilis", "Osmaniye", "D�zce"};
       
       System.out.println("Girilen plaka numarasi:" + Sehirler[plaka] + "iline aittir"); 
       
       
}

}
