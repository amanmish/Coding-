import java.util.*;
class COINS{
public static long count(long N){
if(N<12)
return N;
else
return count(N/2) + count(N/3) + count(N/4);
}
public static void main(String argsp[])throws Exception{
Scanner sc=new Scanner(System.in);
while(sc.hasNextLong()){
long N=sc.nextLong();
System.out.println(count(N));
}
}
}
 