import java.util.*;
public class ArrayList {
			public static  void main(String[] args) {
			List<Parent> P1= new ArrayList<Parent>(10);
			for(int i =0;i<5;i++) 
		    {
		    //Adding objects to the list 
			P1.add(new Parent());
		    }
		    //Printing size of the list 
			System.out.println(P1.size());
			int j =0;
		    //Using for each loop to access individual members of a list 
			for(Parent A:P1) 
			{
			A.sing();
			j++;
			System.out.println(j);
			}
			Parent P4= new Parent();
			//Replacing  members of the list
			P1.set(2,P4);
			//Adding new members to the list 
			P1.add(3,P4);
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

	
	
