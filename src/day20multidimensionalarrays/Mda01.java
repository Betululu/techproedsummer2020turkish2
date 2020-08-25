package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
		
		int mda[][]=new int[3][2];
		mda[1][0] =7;
		//multidimension arrayslar nasil consola yazdirilir
		System.out.println(Arrays.deepToString(mda));
        mda[2][0]=11;
        System.out.println(Arrays.deepToString(mda));
        mda[0][1]=23;
        System.out.println(Arrays.deepToString(mda));
        mda[0][0]=10;
        mda[1][1]=12;
        mda[2][1]=55;
        System.out.println(Arrays.deepToString(mda));
        //multudimensional arrays larde istenen bir elemeni yazdirmak
        System.out.println(Arrays.toString(mda[0]));
        System.out.println(Arrays.toString(mda[1]));
        System.out.println(Arrays.toString(mda[2]));
        
        System.out.println(mda[0][0]);
        System.out.println(mda[1][1]);
        //multi dimensional array olusturmanin kisa yolu nedir
        char mdac [][] = {{'a','b','c'},{'d'},{'e','f'},{'g','h','i'}};
        
        System.out.println(Arrays.deepToString(mdac));
        //soru=yukaridaki mda ilk arrayin elemanlarinin asci degerleri toplamin ekrana yazdir
        
        //1/yol
        System.out.println(mdac[0][0]+ mdac[0][1]+mdac[0][2]);
        
        //2. yol=
        int sum=0;
        for(int i=0;i<mdac[0].length;i++) {
        	sum=sum+mdac[0][i];
        		
        }
        System.out.print(sum);
        
        
        
        
	}

}
