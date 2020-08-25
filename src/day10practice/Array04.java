package day10practice;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// klavyeden girilecek plaka numarasindan ili gosteren uygulamayi yazlim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Il plaka numarasi giriniz");
       int plaka =scan.nextInt();
       String Sehirler[]= {"","Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara",
               "Antalya", "Artvin", "Aydýn", "Balýkesir", "Bilecik", "Bingöl", "Bitlis",
               "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum", "Denizli",
               "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir",
               "Gaziantep", "Giresun", "Gümüþhane", "Hakkari", "Hatay", "Isparta",
               "Ýçel (Mersin)", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
               "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
               "K.maraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize",
               "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon",
               "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
               "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan",
               "Iðdýr", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
       
       System.out.println("Girilen plaka numarasi:" + Sehirler[plaka] + "iline aittir"); 
       
       
}

}
