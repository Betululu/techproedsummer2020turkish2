package day28overriding;

public class Animal {
    public void sound() {
    	System.out.println("Ses cikarairlar");
    }
    public void numOfFoot() {
    	System.out.println("Ayak sayisi bellidir");
    }
    public Animal myMethod() {
    	Animal obj = new Animal();
    	return obj;
    	
    }
}
