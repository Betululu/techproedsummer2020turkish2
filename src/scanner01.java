import java.util.Scanner;

public class scanner01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Tam isminizi giriniz");
        
        String tamIsim = scan.nextLine();
        
        System.out.println(tamIsim);
        
        scan.close();
	}

}
