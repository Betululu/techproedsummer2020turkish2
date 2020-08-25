package day26passbyvalueinheritanse;

public class Car extends Vehicle {
	
	public Car() {
		super(2);
		System.out.println("Car");
	}
	
	public Car(String name) {
		this();
		System.out.println("Car");
	}

	public static void main(String[] args) {
      Car car=new Car("Honda");
	}

}
