import java.util.*;

public class Interface {
			public static  void main(String[] args) {
			Child a = new Child();
		    a.speak();
			a.dance();
			}
			}
interface Parent{
			public void speak();
			public void dance();
			// Notice how all the methods are only provided a signature in an interface 
			}

class Child  implements Parent{
			//Notice how the speak method is defined in the implemented class  
public void speak() {
			System.out.println("abstract method !!");
			}	
public void dance() {
			System.out.println("abstract method no.2 !!");
			}			
			}
	
	
