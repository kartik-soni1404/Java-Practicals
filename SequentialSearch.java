import java.util.*;
public class SequentialSearch 
		{
			public static  void main(String[] args) 
			{
			int[] a= {1,2,3,4,5,6,7,8,9,10};
			int target =-5;
			int index=(SequentialSearch(a,target));
			if(index>0)
			System.out.println("Index of "+target+" is at "+(index+1));
			else
			System.out.println("Not found");
			
			}
			public static int SequentialSearch(int a[],int target) 
			{
			for(int i=0;i<a.length;i++)
			{
			if(a[i]== target)
				return i;
			}
			return -10000000;
			}	
		}
