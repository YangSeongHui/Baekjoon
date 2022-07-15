import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int res = 0;
		
		String tmp = String.valueOf(n);
		
		int num = n-(tmp.length()*9);
		if(num <= 0) num = 1;
		
		for(int i=num; i<n; i++) {
			tmp = String.valueOf(i);
			
			int sum = i;
			for( int j=0; j<tmp.length(); j++ ) sum += tmp.charAt(j)-'0';
			
			if(n == sum) {
				res = i;
				break;
			} else continue;
		}
        
		bw.write(res + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
		
}
