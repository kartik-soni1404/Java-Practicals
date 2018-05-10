import java.util.*;
public class PrimeCount
		{
			public static  void main(String[] args) 
			{
			int arr[]= {11,2,3,5,7};
			int total=0;
			for(int i=0;i<arr.length;i++)
				{	int k=0;
					for(int j=1;j<=arr[i];j++)
					{
						if(arr[i]%j==0)
						k++;
					}
					if(k==2)
						total++;
					
				}
			System.out.println(total);	
			}		
			
		}
		

