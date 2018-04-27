import java.util.*;
public class InsertionSort 
		{
			public static  void main(String[] args) 
			{
			int[] a= {1,5,6,7,8,0,4,3,4,3,2,2,1,1,2,3,3,3,3,6,4,4,2,2,-10};
				Insertionsort(a);
			for(int i=0;i<a.length;i++)
				System.out.print(a[i]+"  ");
			}
			public static  void Insertionsort(int[] a) 
			{
				for(int i =1;i<a.length;i++) 
				{
				int temp =a[i];
				int index=i;
				while((index>0)&&(temp<a[index-1]))
				{
					a[index]=a[index-1];
					index--;
				}
				a[index]=temp;				
				}			
			} 
	
		}
