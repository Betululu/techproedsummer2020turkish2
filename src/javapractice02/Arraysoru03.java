package javapractice02;

public class Arraysoru03 {

	public static void main(String[] args) {
		// Array elemanlarinin ortalaamasini bulan java kodunu yazalim
        int arr[]= {20,30,40,25,-15,55};
        int sum=0;
        double ort=0;
        for(int i=0;i<arr.length;i++) {
        	sum=sum+arr[i];
        }
        ort=sum/arr.length;
        System.out.println(sum);
        System.out.println("Arrayin ortalamasi"+ort);
	}

}
