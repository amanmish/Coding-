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
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    int k=sc.nextInt();
		    for(int i=0;i<n-k;i=i+k)
		    {
		        for(int j=i+k-1;j>=i;j--)
		        {
		            System.out.print(a[j]+" ");
		        }
		    }
		    for(int i=n-1;i>n-k;i--)
		    System.out.print(a[i]+" ");
		    
		    System.out.println();
		}
	}
}