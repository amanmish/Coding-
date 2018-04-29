import java.util.*;
class Array
{
	void subarraySum(int a[],int sum,int n)
	{
		int i,curr_sum=a[0];
		int start=0;
		int count =0;
		for(i=0;i<n;i++)
		{
			while(curr_sum>sum && start<i-1)
			{
				curr_sum=curr_sum-a[start];
				start++;
			}
			if(curr_sum==sum)
			{
				int p=i-1;
				System.out.println("starting index is "+start+" last index is "+p);
				count++;
			}
			if(i<n)
				curr_sum=curr_sum+a[i];
			if(count!=0)
				break;
		}
		if(count==0)
			System.out.println("No Subaaray Found");
	}
	public static void main(String ar[])
	{
		Array obj=new Array();
		int a[]={15,2,4,8,9,5,10,23};
		int n=a.length;
		
		int sum=23;
		obj.subarraySum(a,sum,n);
	}
}