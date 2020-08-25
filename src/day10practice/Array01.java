package day10practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// Array dizisini arraylist e ceviren java kodu yaziniz
		//{"python","Java","PHP","Perl","Ca","C++"}
		
		
    String[] my_array = new String[]{"python","Java","PHP","Perl","Ca","C++"};
    
    System.out.println(Arrays.toString(my_array));
    
    ArrayList<String> list=new ArrayList<String>(Arrays.asList(my_array));
    
    System.out.println(list);
    
    
    
    
    
	}

}
