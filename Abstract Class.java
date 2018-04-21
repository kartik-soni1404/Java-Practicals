import java.util.*;

public class Abstract Class {
			public static  void main(String[] args) {
			Child a = new Child();
		    a.speak();
			}
			}
abstract class Parent{
			public Parent() {
			//	Default constructor 
			System.out.println("Inside test1");
			}
			//	An abstract method 	
			public abstract void speak() ;
			}
class Child  extends Parent{
			//Notice how the speak method is defined in the inherited class  
public void speak() {
			System.out.println("abstract method !!");
			}	
			}
	
	
