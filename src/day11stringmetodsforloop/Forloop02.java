package day11stringmetodsforloop;

public class Forloop02 {

	public static void main(String[] args) {
		// �lk 10 sayma say�s�n�n carp�m�n� ekrana yazd�ran program� yap�n�z.
		
		int product =1;
		
		for( int i = 1; i<=10;i++) {
			
			product =product * i;
					
		}
       System.out.println(product);
       
       // 100 ile 200 aras�ndaki 3 ile bolunebilen say�lar�n toplam�n� yaz�n�z.
       
      int sum = 0;
      
      for(int i=101 ; i<200 ;i++ ){
    	  
    	  if(i%3==0) {
    		  
    		  sum=sum + i;
    		  
    	  }
    	  
      }
     
      System.out.println(sum);
	}

}
