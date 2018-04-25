import java.util.*;
public class Factorial {
			public static  void main(String[] args) {
			
			int x=fact(6);
			System.out.print(x);
			
			}
			public static int fact(int n) {
				if(n==0)
					return 1;
				else
					//Calling the function again (Recursion)
					return (n*fact(n-1));
			}
			}

	
	
