import java.util.*;
public class Replace String
		{
			public static  void main(String[] args) 
			{
				//String that undergoes changes
				String line="This is a sample string: remove me";
				//String that has to be replaced
				String sub="remove me";
				//String that has to be added 
				String rep="add me";
				System.out.print(repl(line,sub,rep));
			}
			public static String repl (String line,String sub,String rep) 
			{
				int x= line.indexOf(sub);
				if(x>=0) 
				{
					String s = new String();
					s=line.substring(0,x);
					int l1=sub.length();
					int l2=line.length();
					s=s+rep+line.substring(x+l1,l2);
					//recursive call 
					return repl(s,sub,rep);
				}
				else
					return line;
			
			}
		
		
		}
