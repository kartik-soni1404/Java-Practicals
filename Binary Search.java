import java.util.*;
public class BinarySearch 
		{
			public static  void main(String[] args) 
			{
			int[] a= {1,2,3,4,5,6,7,8,9,10};
			int target =5;
			int index=(BinarySearch(a,target));
			if(index>0)
			System.out.println("Index of "+target+" is at "+(index+1));
			else
			System.out.println("Not found");
			
			}
			public static int BinarySearch(int a[],int target) 
			{
			int left =0;
			int right =a.length-1;
			int mid =(left+right)/2;
			while (left<=right) 
			{
				
				if(a[mid]>target) 
				{
					right = mid-1;
				}
				else if(a[mid]<target) 
				{
					left = mid+1;
				}
				else
					return mid;
			}
			
			return -1;
			}
		}
