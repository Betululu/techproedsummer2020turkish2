package day26passbyvalueinheritanse;

public class Dog extends Mammal {
	public boolean loyal=true;
	
	public Dog() {
		System.out.println("Dog");
	}

	public static void main(String[] args) {
   Dog od = new Dog();
   od.bark();
   od.smell();
   od.drink();
   od.eat();
   od.feed();
   System.out.println("sadik?"+od.loyal);
   System.out.println("dogum?"+od.dogum);
   System.out.println("yas?"+od.age);
	}
     public   void bark() {
		System.out.println("Havlarlar");
	}
     public   void smell() {
		System.out.println("Iyi koku alirlar");
	}
}
