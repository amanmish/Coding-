import java .util.*;
class code7
{
public static void main(String r[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
sc.nextLine();
while(t-->0)
{
	int i,l,j,c=0;
String s=sc.nextLine();
char a[]=s.toCharArray();
 l=a.length;
for(i=0;i<l;i++)
{
for(j=i+1;j<l;j++)
{
if(a[i]==a[j])
{
c++;
break;
}
}
if(c!=0)
break;
}
if(c!=0)
System.out.println("yes");
else
System.out.println("no");
}
}
}