package day15constructors;

public class C02 {
	int i = 12;
	static int k = 13;

	public static void main(String[] args) {
		C02 obj1 = new C02();
		obj1.i=20;
		System.out.println(obj1.i);
		obj1.k =30;
        C02 obj2 = new C02();
        System.out.println(obj2.i);
        System.out.println(obj2.k);
        
	}

}
