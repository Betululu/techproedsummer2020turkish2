package foreachloop;

import java.util.ArrayList;
import java.util.List;

public class Foreachloop01 {

	public static void main(String[] args) {
		// 
		List <Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		//ilk 3 elemanini yazdiriniz 
		
		for(int w : il) {
			System.out.println(w);
		}
		int count =0;
		for(int w : il) {
			if(count<3) {
				System.out.print(w +" ");

				count++;
			}
		}
		//2.yol
		int c=0;
		for(int w : il) {
			System.out.println(w +" ");
			c++;
			if(c==3) {
				break;
			}
		}
		System.out.println();
		
		//il listesindeki 3 ile bolunebilenleri yazdirin
		for(int w : il){
			if(w%3==0) {
				System.out.println(w +" ");
			}
		}
		//2.yol
		for(int w : il){
			if(w%3!=0) {
				continue;
			}else {
				System.out.print(w +" ");
			}
		}
	
		
	}

}
