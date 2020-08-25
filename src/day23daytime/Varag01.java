package day23daytime;

public class Varag01 {

	public static void main(String[] args) {
		// Varargs normalde bir array dir ama uzunlugu kullanicinin
		//girdigi deger sayisina gore buyur
       //Varargs dipsiz kuyu gibidir ne atarsan alir
		//1.varargs sonra baska parametre kullanilmazVarargs metod parantezi
		//icinde herzaman en son parametre olmalidir
		//2.Varargs son da olduktan sonra oncesinde varargs olmayan parametrelrkullaniabilir
		//3.bir metod parantezinin icinde sadece bir parametre kullanilr
		// ne kadar sayi girersen ekrana carpimi yazsin 
		product(2,3);
		add(1,2,3,4);
	}
    public static void product(int...y) {
    	int product=1;
    	for(int w:y) {
    		product=product*w;
    		
    	}
		System.out.println(product);
	}
    public static void add(int...x) {
    	int sum=0;
    	for(int w :x) {
    		sum=sum+w;	
    	}
		System.out.println(sum);
	}
    
}
