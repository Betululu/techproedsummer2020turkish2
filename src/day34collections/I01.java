package day34collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		
		List<String>list1=new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
		
		ListIterator<String>li1=list1.listIterator();
		while(li1.hasNext()) {
			Object el =li1.next();
			li1.set(el + "A");
		}
		System.out.println(list1);
		//hasprevios methodlarini kullanabilmemiz icin once 
		//hasnext methodunu kullanmak gerekir
		while(li1.hasPrevious()) {
			Object el =li1.previous();
			//li1.set(el +"A");
			
			System.out.print(el +" ");
		}
		
		
		
	}

}
