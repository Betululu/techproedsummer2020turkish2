package day35collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q01 {

	public static void main(String[] args) {
		//Ilk eklenen ilk silinir===>FIFO:First in first out eczahane
		//iki tane childclassi var linked ve priority queue dir
		Queue<String> q01 = new LinkedList<>();
		q01.add("Apple");
		q01.add("Grape");
		q01.add("Mango");
		q01.add("Fig");
		q01.add("Banana");
		System.out.println(q01);
		
		
		q01.remove();
		System.out.println(q01);
		
		//q01.element();//size ilk elemani verir ama elemani queue den silmez
		//ilk eleman yoksa NoSuchExceptionElement verir
		System.out.println(q01.element());
		System.out.println(q01);
		
		q01.peek();//ilk elemani vrir Queue den silmez element ten 
		//farki ise ilk eleman yoksa null return eder
		
		//q01.poll();//size ilk elemani verir ama siler
		System.out.println(q01.poll());
		System.out.println(q01);
		
		Queue<String> q02 = new PriorityQueue<>();
		
		q02.add("Apple");
		q02.add("Grape");
		q02.add("Mango");
		q02.add("Fig");
		q02.add("Banana");
		System.out.println(q02);
		
		
	}

}
