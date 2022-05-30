import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		int A,B,C = 0;
		
		for(int i=1; i<=num; i++) {
			A = i/100;
			B = (i/10)%10;
			C = i%10;
			
			if(i<100) 
				cnt++;
			else {
				if((A-B) == (B-C))
					cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
	}
	
}