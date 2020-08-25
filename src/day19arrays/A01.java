package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {

       int arr[]= {3,7,1,18};
       //Array elemanlarini kucukten buyuge siralayalim(sort)
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       //Bir sitrin array olusturun elemanlarini alfabetik sirada dizin
       
       String srr[]= {"Ali","Veli","Can","Fadime"};
       Arrays.sort(srr);
       System.out.println(Arrays.toString(srr));
       //bir integer array deki en buyuk ve en kucuk sayiyi  ekrana yazdirin
       
       int irr[]= {13,9,6,18,23,7,11};
       Arrays.sort(irr);
       System.out.println(Arrays.toString(irr));
       System.out.println("en kucuk" + irr[0]);
       System.out.println("en buyuk" +irr[irr.length-1]);
       
       // bir string array olusturun alfabetik siraya gore bastan ve sondan ikinci
       //elemanlari ekrana yazdirin
       
       String str1[]= {"Ali","Veli","Can","Fadime"};
       Arrays.sort(str1);
       System.out.println(str1[1]);
       System.out.println(str1[str1.length-2]);
        //bir elemanin array de var olup olmadigini kontrol edelim
       
       int nrr[] = {2,1,7,3,5};
       
       //yukaridaki(nrr) array de 7 elemaninin var olup olmadigini kontrol edelim
       
       
       //1. yol loop ile
       int count=0;
        for( int i =0;i<nrr.length;i++) {
        	if(nrr[i]==7) {
        		count++;
        		
        	}
        	

        }
        		
        if( count!=0){
        	System.out.println("7 eleman olarak var");
        }else {
        	System.out.println("7 eleman olarak yok");
        }
        		
        	//2. yyol binarySearch() kullanarak	
        	Arrays.sort(nrr);
        	System.out.println(Arrays.binarySearch(nrr, 7));
        		//array de varsa yazar yoksa olmasi gereken yeri yazar
        		System.out.println(Arrays.binarySearch(nrr, 6));
        		
        		//not=Bir array de tekrarli eleman varsa binarySearch() metodu elemanin var olup olmadigi 
        		// hakkinda dogru karar vererbilir ama o elemnin sirasi hakkinda bazen yanilir
        		
        		int mrr[]= {3,8,3,11};
        		Arrays.sort(mrr);
        		System.out.println(Arrays.binarySearch(mrr, 3));
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        	
       
       
       
       
       
	}

}
