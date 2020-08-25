package practiceday08;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysoru01 {

	public static void main(String[] args) {
		// Array elemanlarini siralayan bir kod yaziniz 
       Scanner scan=new Scanner (System.in);
       
       int arr [] = new  int [5];
      for (int i = 0; i < arr.length; i++) {
		arr[i]=scan.nextInt();
	}
      System.out.println(Arrays.toString(arr));
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
       String [] str= {"java","C#","pyhton","C++"};
       System.out.println(Arrays.toString(str));
	}

}
