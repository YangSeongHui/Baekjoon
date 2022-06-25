import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException  {
		
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   int fac = 1;
	   
	   for(int i=2; i<=N; i++) {
		   fac = fac * i;
		   
	   }
	   
	   System.out.println(fac);
	   
   }
   
}		
	