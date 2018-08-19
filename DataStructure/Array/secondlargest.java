import java.util.*;
class secondlargest
{
public static void main(String ar[])
{
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("enter the array elements");
for(int i=0;i<=3;i++)
{
a[i]=sc.nextInt();
}
System.out.println("array is:");
for(int i=0;i<=3;i++)
{
System.out.println(a[i]);
}
int b=0;
int c=0;
int j=0;
for(int i=0;i<=3;i++)
{
	c=a[i+1];
	if(a[i]>b)
	{
		b=a[i];
		if(b>c)
			b=c;
	}
	
}
System.out.print("largest is");
System.out.println(c);
}
}
