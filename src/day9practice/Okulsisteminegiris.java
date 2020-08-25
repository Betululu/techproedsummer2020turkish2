package day9practice;

public class Okulsisteminegiris {

	public static void main(String[] args) {
		System.out.println("*****OKULUMUZA HOS GELDINIZ*****");
	      System.out.println("Okul Ismi:" + Sabitbilgiler.OKUL_ISMI);
	      System.out.println("Okul Muduru:" + Sabitbilgiler.MUDUR);
	      System.out.println("Okul Telfon Numarasi:"+Sabitbilgiler.TELEFON_NO);
	      System.out.println("Okul Adresi:"+ Sabitbilgiler.ADRES);
	      System.out.println("Okul web Sitesi:"+Sabitbilgiler.WEBSITESI);
	      System.out.println("Okul Teknik Destek:"+Sabitbilgiler.TEKNIK_DESTEK);
	      
	      System.out.println("\nOGRETMEN OLUSTURALIM\n");
     	      
	     Ogretmen ogretmen1=new Ogretmen();
	     ogretmen1.setIsim("Suleymen Bey");
	     ogretmen1.setBrans("java"); 
	     ogretmen1.setTelefon("+321432143"); 
	      
	     Ogretmen ogretmen2=new Ogretmen();
	     ogretmen2.setIsim("Hamza Bey");
	     ogretmen2.setBrans("Selenium"); 
	     ogretmen2.setTelefon("+321432143"); 
	     
	     System.out.println("\n isim :" +ogretmen1.getIsim());
	     System.out.println("\n Brans:"+ogretmen1.getBrans() );
	     System.out.println("\n Telefon:"+ogretmen1.getTelefon());
	     
	     System.out.println("\n isim :" +ogretmen2.getIsim());
	     System.out.println("\n Brans:"+ogretmen2.getBrans() );
	     System.out.println("\n Telefon:"+ogretmen2.getTelefon());
	     
	     Ogretmen ogretmenAli=new Ogretmen ("Ali","Matemtik","23446532");
	     
	     System.out.println(" isim :" +ogretmenAli.getIsim());
	     System.out.println(" Brans:"+ogretmenAli.getBrans() );
	     System.out.println("Telefon:"+ogretmenAli.getTelefon());
	     
	     System.out.println("\n" +ogretmen1.toString());
	     System.out.println("\n"+ogretmen2.toString() );
	     System.out.println("\n "+ogretmenAli.toString());
	     
	     System.out.println("\n OGRENCI OLUSTURALIM \n");
	     
	     Ogrenci ogrenci1=new Ogrenci();
	     Ogrenci ogrenci2=new Ogrenci();
	     
	     ogrenci1.setIsim("Hasan Dogan");
	     ogrenci1.setOgrenciNo(1);
	     ogrenci2.setIsim("Mehmet Kocaaslan");
	     ogrenci2.setOgrenciNo(2);
	     
	     System.out.println(ogrenci1.toString());
	     System.out.println(ogrenci2.toString());
	     
	     System.out.println("\n OGRETMENLER OLUSTURUYORUZ");
	     Ogretmenler ogretmenler =new Ogretmenler();
	     
	     ogretmenler.ogretmenEkle(ogretmen1);
	     ogretmenler.ogretmenEkle(ogretmen2);
	     System.out.println(ogretmenler.toString());
	     
	     System.out.println("\n OGRENCILER OLUSTURUYORUZ");
	     
	     Ogrenciler ogrenciler = new Ogrenciler();
	     
	     ogrenciler.ogrenciEkle(ogrenci1);
	     ogrenciler.ogrenciEkle(ogrenci2);
	     System.out.println(ogrenciler.toString());
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
