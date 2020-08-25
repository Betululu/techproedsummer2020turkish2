package javapractice02;

public class Questions02 {

	public static void main(String[] args) {
		// Asal sayiyi bulan bir metod yazalim
         asalSayi(21);
	}
	public static int asalSayi(int num) {
		int count=0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Asal sayidir"+ num);
		}else {
			System.out.println("Asal sayi degildir ");
		}
		return num;
	}

}
