package day24accesmodifier;

  /*
   * 1. String clas her degisim icin yeni bir string olusturur var olani degistirmez 
   *  bu yuzden Stringler immutable(degistilimez)dir
   * String builder ler ise degisime aciktir yeni strin golusturmadan var olani degistirmek mumkundur
   * StringBuilder ler mutable(degistirilebilir) demektir
   */


public class Sb02 {

	public static void main(String[] args) {
		//StringBuilder olusturmak icin 3 yol var
		//1.yol
		StringBuilder stb1 =new StringBuilder();
		System.out.println(stb1);
		
		stb1.append("Java");
		System.out.println(stb1);
		
		stb1.append("Kolaydir");
		System.out.println(stb1);
		//2.yol
		StringBuilder stb2=new StringBuilder(5);
		stb2.append("Ali");
		System.out.println(stb2);
		stb2.append("kazandi");
		System.out.println(stb2);
		//3. yol
		StringBuilder stb3 =new StringBuilder("Java");
		System.out.println(stb3);
		/*soru
		 1.ucuncu yolla bir string olusturun
		 2.bu stringe eklem yapin
		 3.Bu sitringin belli bir bolumun ekrana yazdirin
		 */
		StringBuilder stb4=new StringBuilder("Java gercekten kolay mi?");
		stb4.append("Calisirsan kolay").append("himmm");//method chain/metod zinciri
		System.out.println(stb4);
		System.out.println(stb4.substring(5,15));
		
		System.out.println(stb4.charAt(3));//a
		
		System.out.println(stb4.delete(40, 45));
		
		System.out.println(stb4.getClass()); //hangi classin costructerini kullandiysak onu veriyor
		
		System.out.println(stb4.indexOf("kolay"));//15
		
		System.out.println(stb4.insert(4, ","));//virgul ekler
		
		System.out.println(stb4.lastIndexOf("a"));//39
		
		System.out.println(stb4.length());//41
		
		System.out.println(stb4.replace(25, 35, ""));//aradakileri siler
		
		//String tersten yazdirma  loop ile
		String s= "";
		
		for (int i =stb4.length()-1;i>=0; i--) {
			s=s+stb4.charAt(i);	
		}
		System.out.println(s);
		//string builder ile tersten yazma
		System.out.println(stb4.reverse());
		stb4.reverse();
		System.out.println(stb4);
		stb4.setCharAt(6, 'x');
		System.out.println(stb4);//karaktreri degistirir
		
		//capacity() bve lenght() farki
		StringBuilder stb5 = new StringBuilder(11);
		stb5.append("Javammmmmmmmm");
		
		/*belirlenen kapasiteyi gecerseniz kapsitenin 2 katinin 2 fazlasi olur
		 *2 katinin 2 fazlasini gecerseniz capacity ile lenght ayni olur 
		 */
		System.out.println(stb5.capacity());
		System.out.println(stb5.length());
		
		
		
		
		
		
		
		
		
		
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
