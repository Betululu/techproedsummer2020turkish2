package javapractice;

import java.util.Arrays;

public class Arraysoru {

	public static void main(String[] args) {
    // Array elemanlarinin matematige gore tersini alalim
		//1,2,-3,-4
		//-1,-2,4,5
		int arr[]= {1,2,-3,-4,-5};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sayininTersi(arr)));
	}
	
	public static int[] sayininTersi(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]*=-1;
		}
		return arr;
	}
	

}
