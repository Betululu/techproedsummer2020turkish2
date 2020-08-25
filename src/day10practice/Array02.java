package day10practice;

import java.util.ArrayList;

public class Array02 {

	public static void main(String[] args) {
		//ArrayListi Array e ceviren java kodu
		//{"python","Java","PHP","Perl","Ca","C++"}

		ArrayList<String> list =new ArrayList<String>();
		list.add("python");
		list.add("java");
		list.add("PHP");
		list.add("Perl");
		list.add("Ca");
		list.add("C++");
		 String[] arr=new String[list.size()];
		 list.toArray(arr);
		 for(String str : arr) {
			 System.out.print(str +" ");
		 }
		
		
		
		
		
		
		
		
	}

}
