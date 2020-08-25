package staticblok;

public class Sb01 {
	static double pi;
	Sb01(){
		System.out.println("Consructor");
	}
	static {
		pi=3,14;
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		
		System.out.println("Maýn block");
        Sb01 obj =new Sb01();
        
	}

}
