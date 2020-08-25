package day28overriding;

public class Dog  extends Animal{
	/*
     * 1 parentteki methodu mothod signatureni degistirmeden method body sini degistirerek child classda
     * kullanmaya "Method everriding"denir
     */
	public static void main(String[] args) {
    Dog dog = new Dog();
    dog.sound();
	}
  public void sound() {
	  System.out.println("Havlarlar");
  }
@Override
public void numOfFoot() {
	System.out.println("4 ayaklari var");
}
}
