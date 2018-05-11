import java.util.*;
public class Test 
		{
			public static  void main(String[] args) 
			{
			int n=10;
			int d=100;
			ArrayList<Integer> x=new ArrayList<Integer>();
			ArrayList<Integer> y=new ArrayList<Integer>();
			ArrayList<Integer> z=new ArrayList<Integer>();
			int i,j;
			for(i=1;i<=n;i++)
				if(n%i==0)
					x.add(i);
			for(j=1;j<=d;j++)
				if(d%j==0)
					y.add(j);
			for(Integer a: x)
				for(Integer b:y)
					if(a==b)
						z.add(a);
			int m =Integer.MIN_VALUE;
			for(Integer c:z)
				if(c>m)
					m=c;
					
			System.out.print(m);
			}		
			

			 
		}
		

