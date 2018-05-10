import java.util.*;
public class Palindrome 
		{
			public static  void main(String[] args) 
			{
				//Place the string to be tested in s
				String s= "MalayalaM";
				String k=new String();
				int l = s.length();
				k+=s.substring(l-1);
				for(int j=l-1;j>0;j-- )  
				{
					k+=s.substring(j-1,j);
				}
				if(k.equals(s)) 
				{
						System.out.println("Palindrome confirmed");
				}
				else
				{	
						System.out.println("It isn't a palindrome");
				}
			}		
			
		}
		

