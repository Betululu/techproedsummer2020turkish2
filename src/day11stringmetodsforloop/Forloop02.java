package day11stringmetodsforloop;

public class Forloop02 {

	public static void main(String[] args) {
		// Ýlk 10 sayma sayýsýnýn carpýmýný ekrana yazdýran programý yapýnýz.
		
		int product =1;
		
		for( int i = 1; i<=10;i++) {
			
			product =product * i;
					
		}
       System.out.println(product);
       
       // 100 ile 200 arasýndaki 3 ile bolunebilen sayýlarýn toplamýný yazýnýz.
       
      int sum = 0;
      
      for(int i=101 ; i<200 ;i++ ){
    	  
    	  if(i%3==0) {
    		  
    		  sum=sum + i;
    		  
    	  }
    	  
      }
     
      System.out.println(sum);
	}

}
