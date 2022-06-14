import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
 
public class Main {
   public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		int N = Integer.parseInt(br.readLine());
		
		String tmp[] = br.readLine().split(" ");
		
		int arrn[] = new int[N];
		
		for(int i=0; i<N; i++)
			arrn[i] = Integer.parseInt(tmp[i]);
		
		int M = Integer.parseInt(br.readLine());
		
		tmp = br.readLine().split(" ");
		
		int arrm[] = new int[M];
		
		for(int i=0; i<M; i++)
			arrm[i] = Integer.parseInt(tmp[i]);
		
		Arrays.sort(arrn);
		
		for(int i=0; i<M; i++)
			bw.append(search(0,N-1,arrm[i],arrn)+"\n");
		
		bw.close();
		br.close();
		
	}
   
   static public int search(int start, int end, int input, int result[]) {
	   int mid = (start+end)/2;
	   
	   if(start>end)
		   return 0;
	   
	   if(result[mid] == input)
		   return 1;
	   else if(result[mid]<input)
		   return search(mid+1,end,input,result);
	   else
		   return search(start,mid-1,input,result);
   }
    
}