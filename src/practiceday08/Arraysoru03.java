package practiceday08;

public class Arraysoru03 {

	public static void main(String[] args) {
		// Bir int array icindearadiginiz sayiyi kontrol ediniz
		//[12,32,34,54,45]
		int sayilar[]= {12,32,34,54,45};
		for (int i = 0; i < sayilar.length; i++) {
			
	
			if(String.valueOf(sayilar[i]).contains("34")) {
				System.out.println("aradiginiz deger var");
				break;
			}else {
				System.out.println("aradiginiz deger yok");
		}
		}
	}

}
