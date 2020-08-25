package javapractice;

public class Qestion05 {

	public static void main(String[] args) {
		// girilen sayinin tersini return eden java metodu yaz
		//123 321
		

	}
	public static int SayininTersi(int n) {
		int sonuc=0;
		
		while(n>0) {
			int temp=n%10;
			n/=10;
			sonuc=sonuc*10+temp;
		}
		return sonuc;
	}

}
