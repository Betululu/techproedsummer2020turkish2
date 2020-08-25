package day28overriding;

public class Cat extends Animal {

	public static void main(String[] args) {
    Cat cat=new Cat();
    cat.sound();
	}
   public void sound(){
	   System.out.println("Miyavlarlar");
   }
@Override
public void numOfFoot() {
	System.out.println("4  ayagi vardir");
}
@Override
public Animal myMethod() {
	// TODO Auto-generated method stub
	return super.myMethod();
}
}
