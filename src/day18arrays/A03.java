package day18arrays;

public class A03 {

	public static void main(String[] args) {
		// Length'i ayni olan iki arrays olusturunuz arrayslarin 
		//tum elemanlari ayni ise ekrana ayni farkli ise ekrana ayni degil yazsin
		int arr1[]= {1,2,3,4};
		int arr2[]= {1,2,3,4};
		
		for(int i = 0;i<arr1.length;i++) {
			
			if(arr1==arr2) {
				System.out.println("ayni");
				
			}else {
				System.out.println("ayni degil");
			}
				
		}

	}

}
