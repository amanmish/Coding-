import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class CHEFSTUD {
 
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		while(t-- > 0) {
			String config = in.readLine();
			int i,j,count=0;
			for(i=0;i+1<config.length();i++)
				if(config.charAt(i)=='<' && config.charAt(i+1)=='>')
					count++;
			System.out.println(count);
		}
	}
}