package day33iterator;

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
		
		//list1 icindeki her elemanin sonuna "A" harfini ekleyin
		//loop kullanarak listleri degistiremeyiz elemanlari degistirebiliriz sadece
		
		for(String w : list1) {
			w= w + "A";
		}
		System.out.println(list1);
		
		//bir listi update etmek isterseniz iterator kullanmak zorundayiz
		//1. adim:listiterator objesi olusturalim

		ListIterator<String>li1=list1.listIterator();
		
		//2.adim:while loop kullanin
		while(li1.hasNext()) {
		Object element =li1.next();
		li1.set(element + "A");
		}
		
		System.out.println(list1);
	}

}
