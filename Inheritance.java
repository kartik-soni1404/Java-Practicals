import java.util.*;
public class Test {
			public static  void main(String[] args) {
			Child a = new Child();
			a.speak();
			a.dance();
			//Now it will go to the parent class as it does not have a sing function in the Child class
			a.sing();
			}
			}
class  Parent{
			//Default constructor 
			public Parent() {
			System.out.println("Inside the parent class ");
			}
			public void sing() {
			System.out.println("Inside parent method ");
			}
			}
class Child extends Parent{	
public void speak() {
			System.out.println("abstract method !!");
			}	
public void dance() {
			System.out.println("abstract method no.2 !!");
			}			
			}
	
	
