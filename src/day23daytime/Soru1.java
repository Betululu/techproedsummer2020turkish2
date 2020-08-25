package day23daytime;

import java.util.ArrayList;
import java.util.List;

public class Soru1 {

	public static void main(String[] args) {
		// iki listarray olusturalim listlerdeki ortak elemanlari foo each loop  kullanarak
		//calistirriniz ortak eleman yoksa ortak eleman yok yazdiriniz
		 List<String> l1=new ArrayList<>();
		 l1.add("A");
		 l1.add("B");
		 l1.add("C");
		 l1.add("D");
		 
		 List<String> l2 =new ArrayList<>();
		 l2.add("X");
		 l2.add("Y");
		 l2.add("Z");
		 l2.add("T");
		 
		 int count=0;
		 for(String w : l1) {
			 for(String x : l2) {
				 if(w.equals(x)) {
					 System.out.println(w);
					 count++;
					 
				 }
				 
			 }
			 
		 }
		 if(count==0) {
			 System.out.println("ayni elemen yok");
		 }
		 
		 

	}

}
