import java.util.*;

public class JavaTest1 {
		
	  

	public static void main(String[] args) {
		int arr[][]={{13,14,15},
					{16,17,18},
					{19,20,21},
					{22,23,24}};
	
	int x,y,z,temp;
	temp=0;
	x=arr.length;//row
	y=arr[0].length;//column
	for(int a=x-1;a>=0;a--){
		
		for(int b=y-1;b>0;b--){
		arr[a][b]=arr[a][b-1];
		
		}
		if(a>0)
		{
			arr[a][0]=arr[a-1][y-1];
			
		}
		
		
		
	}
	arr[0][0]=48;
	for(int i=0;i<x;i++){
	for(z=0;z<y;z++){
	System.out.print(arr[i][z]+"  ");
	}
	System.out.print("\n");
	}
	}

	
}
