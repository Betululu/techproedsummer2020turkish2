package javapractice02;

public class Array02 {

	public static void main(String[] args) {
		// bir int array icindeki tekrarlanana elemani bulunuz
		int arr[]= {1,2,2,3,4,4,5};
		tekrarVArmi(arr);
	}
		public static void tekrarVArmi(int [] arr) {
			int flag=0;
			for (int i = 0; i < arr.length; i++) {
				for(int j=i+1;j<arr.length;j++) {
				if((arr[i]==arr[j]) && (i!=j)) {
					System.out.println("tekrarlana eleman "+arr[j]);
					flag++;
				}			
		}
			
		}

        System.out.println(flag);
        if(flag==0) {
        	System.out.println("tekrarlanan eleman yok");
	}
}
}
