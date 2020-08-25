package javapractice;

import java.util.Arrays;

public class day07 {

	public static void main(String[] args) {
    //3 elemanli string array olusturalim
		//clever,meek,nice
		//tek tek ve liste halinde yazdiralim
		//her array elemanina "ly" takisi ekleyelim
		
		String arr [] = new String [3];
		
		arr[0]="clever";
		arr[1]="meek";
		arr[2]="nice";
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
		for(String w: arr) {
			System.out.println(w +" " );
		}
		System.out.println();
		String arr1[]= {"clever","meek","nice"};
		String ek="ly";
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].concat(ek)+" ");
		}
		
		
	}

}
