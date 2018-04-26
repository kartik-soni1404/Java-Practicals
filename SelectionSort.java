import java.util.*;
public class SelectionSort
		{
			public static  void main(String[] args) 
			{
			int[] a= {1,5,6,7,8,0,4,3,2};
				Selectionsort(a);
			for(int i=0;i<a.length;i++)
				System.out.print(a[i]+"  ");
			}
			public static void Selectionsort(int n[]) 
			{
				for(int j=0;j<n.length-1;j++) 
				{
				int minIndex =j;
				for(int k=j+1;k<n.length;k++)
				{
				if(n[k]<n[minIndex])
					minIndex=k;		
				}
					int temp=n[j];
					n[j]=n[minIndex];
					n[minIndex]=temp;
				}
			}
		}

	
	
