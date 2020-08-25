package practiceday08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ArrayListManav {
	static List<String> urunListesi =new ArrayList<>();
	static List<Float> urunFiyatlari = new ArrayList<>();
	static float toplamOdenecekTutar;
	
	public static void main(String[] args) {
		
		
		/* Basit bir manav alisveris programi yapalim
		* 1. adim : Urun listesinden urun sectir ve kac kilo 
		* oldugunu sor
		* 
		* 2. adim :Baska bir urun almak isteyip istemedigini sor
		* istemiyorsa toplam miktari goster,istiyorsa tekrar urun sectir
		* 3.adim :musteri her urun sectiginde ,aldigi urun fiyatini toplam 
		* fiyata ekle
		* 
		* 4.adim :Alisveris bitince toplam odemesi gereken tutari
		* goster
        *
        **/
		
		urunListesi.add("Domates-urun Kodu : 0");
		urunListesi.add("Biber-urun Kodu : 1");
		urunListesi.add("Erik-urun Kodu :2");
		urunListesi.add("Karpuz-urun kodu :3");
		urunListesi.add("Havuc-urun Kodu :4");
		
		urunFiyatlari.add(2.0f);
		urunFiyatlari.add(3.0f);
		urunFiyatlari.add(10.0f);
		urunFiyatlari.add(5.0f);
		urunFiyatlari.add(3.0f);
		System.out.println(urunListesi.toString());
		musteriSecim();
		
	}
	public static void musteriSecim() {
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Hangi urunu secmek istersiniz");
		int secim=scan.nextInt();
		System.out.println("Kac kilo almak istersiniz ");
		float kilo=scan.nextFloat();
		float urunFiyati= urunFiyatlari.get(secim);
		float toplamUrunFiyati=kilo*urunFiyati;
	    toplamOdenecekTutar+= toplamUrunFiyati;
		
		
		System.out.println("Sectiginiz Urun :"+ urunListesi.get(secim));
		System.out.println("Urun Fiyati" + toplamUrunFiyati);
		System.out.println("Alisverise devam etmek isterseniz 1,kasaya gitmek icin 2 yaziniz");
		
		int karar=scan.nextInt();
		if(karar==1) {
			musteriSecim();
			}else {
				kasa();
			}
	}
		public static void kasa() {
			System.out.println("Toplam odenek tutar:" +toplamOdenecekTutar);
			
		}
		
		
		
	

}
