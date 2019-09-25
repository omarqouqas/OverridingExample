package OverridingExample;

public class Honda extends Car {
	
	protected String steer(){
		return "Reverse";
	}
	
//	
	public static void main(String[] args){
		Car myCar = new Honda();
		System.out.println(myCar.steer());
		
	}

}

/*In the example above, the "myCar" variable is declared to be a Car. During compile time,
the compiler checks if the Car class has the steer() method. As long as the Car class has the steer() method,
the code compiles. At run-time, a Honda is created and assigned to myCar. The JVM knows that myCar is referring to the object of Honda, 
so it calls the steer() method of Honda. This is called Dynamic Polymorphism.*/

/*1- Overriding is implemented in inheritance. The same method is written in the parent and child class. The method in the child class will override the method in the parent class.
2- If the child class is not satisfied with the implementation of a method in the super (parent) class, the child class can override that method.
3- The 2 methods MUST have the same name, return type and same scope
4- Static or final methods can NOT be overridden 

1). Polymorphism applies to overriding, not to overloading.*/