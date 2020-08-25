package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		int arr1[] =new int[3];
		System.out.println(Arrays.toString(arr1));
       arr1[2]=11;
       System.out.println(Arrays.toString(arr1));
       arr1[1]=9;
       System.out.println(Arrays.toString(arr1));
       arr1[0]=1;
    	System.out.println(Arrays.toString(arr1));
    	
    		   //Kisa yoldan arrays' yazdirmak.
    		   
    		   int arr2[]= {8,10,12,14};
    		   System.out.println(Arrays.toString(arr2));
    		   System.out.println(arr2[2]);
    		   
    		   //"llk elemani yazdiran kod nedir
    		   System.out.println(arr2[0]);
    		   
    		   //Son elemani yazdiran kod nedir
    		   System.out.println(arr2[arr2.length-1]);
    		   
    		   //Arrays de yeni bir dizi olusturup forloop dongusu ile yanayana yazdiralim
    		   int arr4[]= {1,2,5,7,9};
    		   
    		   for(int i=0;i<arr4.length;i++) {
    			   System.out.print(arr4[i]+" ");
	           }
    		   
    		   //Bir arrays in cift sayi elemanlarini while dongusu kullanarak yanayana yazdiriniz
    		   
    		   int arr5[]= {23, 24, 25, 26, 27, 28, 29};
    		   
    		   int i= 0;
    		   
    		   while(i<arr5.length) {
    			  if(i%2==0) {
    				System.out.println(arr5[i]+" ");  
    			  }
    			  i++;
    		   }
	}		   
	}
		
	
		
	
		
		
    			 
    				  
    			  
    				  
    			  
    			  
    		   
    		   
	
    		   
    		   
    		   
	


