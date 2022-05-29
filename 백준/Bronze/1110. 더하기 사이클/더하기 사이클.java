import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		int m = num;
		
		do {
			m = (m%10)*10+(m/10+m%10)%10;
			cnt++;
		} while (num!=m);
		
		System.out.println(cnt);
		
	}
}