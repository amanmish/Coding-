import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Combo {

  public static void main(String[] ar) 
 {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();

	  while(t>0)
	  {
		  
          List<String> results = new ArrayList<String>();
	      String a=sc.nextLine();
	       char args[]=a.toCharArray();
           for ( int i = 1; i <= (1<<(args.length))-1; i++ )
			   {
          StringBuilder builder = new StringBuilder();
               }
	        int c=0,j,i;
	       for(i=0;i<args.length;i++)
	       {
		       for(j=i+1;j<args.length;j++)
		       {
			        if(args[i]==args[j])
			        {
			         	c++;
				        break;
			        }
		        }
	        }
	         if(c==0)
			    System.out.println("no");
	        else
		        System.out.println("yes");
			t--;
       }
    }
}