/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    sc.nextLine();
		    String s=sc.next();
		    int start=0,end=s.length()-1;
			//System.out.println(s.length());
		    int j=0;
		    char c[]=new char[s.length()];
		    while(end>=0)
		    {
		        int ass=(int)s.charAt(end);
			
		        if( (ass>64 && ass<91)||(ass>96 && ass<122))
		        {
					if((int)c[j+1]!=0)
						j++;
		            c[j]=s.charAt(end);
		            j++;
		            end--;
					//System.out.println(end);
		        }
		        else
		        {
					
		            c[end]=s.charAt(end);
		            end--;
					
		        }
		        
		    }
			String ans=new String(c);
		        System.out.println(ans);
		}
	}
}