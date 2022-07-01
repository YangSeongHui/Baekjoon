import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String tmp[] = br.readLine().split(" ");
		
		Stack<Integer> coins = new Stack<Integer>();
		
		int count = 0;
		int sum = 0;
		int n = Integer.parseInt(tmp[0]);
		int k = Integer.parseInt(tmp[1]);
		
		for(int i=0; i<n; i++) {
			int money = Integer.parseInt(br.readLine());
			coins.push(money);
			if(money>k)
				continue;
		}
		
		int result = k;
		while(sum!=k) {
			int tmp_coins = coins.pop();
			count = count + result/tmp_coins;
			sum = sum + tmp_coins*(result/tmp_coins);
			
			result -= tmp_coins*(result/tmp_coins);
		}
		
		System.out.println(count);
		
	}
	
}