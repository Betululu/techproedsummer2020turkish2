package day26passbyvalueinheritanse;

public class Mammal extends Animal{
	 public boolean dogum =true;
	 
	 public Mammal () {
		 System.out.println("Mammal");
	 }

	public static void main(String[] args) {
		Mammal om =new Mammal();
		   om.eat(); 
		   om.drink();
		   om.feed();
	}
   public  void feed() {
	System.out.println("yavrularni beslerler");
}
}
