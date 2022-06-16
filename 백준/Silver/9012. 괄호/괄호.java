import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
   public static void main(String[] args) throws IOException  {
		
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T-- > 0) {
		   Stack<String> stack = new Stack<>();
		   String res = "YES";
		   String[] N = br.readLine().split("");
		   
		   for(int i=0; i<N.length; i++) {
			   if(N[i].equals("(")) stack.push("(");
			   else if(N[i].equals(")")) {
				   if(stack.isEmpty()) res = "NO";
				   else stack.pop();
				   
			   }
			   
		   }
		   
		   if(!stack.isEmpty()) {
			   res = "NO";
			   
		   }
		   
		   bw.write(res + "\n");
	   }
	   
	   bw.flush();
	   bw.close();
		
   }
   
}		
	