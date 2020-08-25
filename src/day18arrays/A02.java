package day18arrays;

public class A02 {

	public static void main(String[] args) {
		char ch1[]= {'a','b','c','d'};
		char ch2[]= {'a','b','c','d'};
		int z=0;
		 for(int i =0;i<ch1.length;i++) {
			 if(ch1 [i]==ch2 [i]) {
				 z++;
				 
			if(z==ch1.length) {
				System.out.println("Ayni");
			}
			else {
				System.out.println("Ayni degil");
			}
			 }
		 }

	}

}
