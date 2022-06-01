import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		int score[] = new int[no];
		int max = 0;
		float sum = 0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
			
			if(score[i] > max) {
				max = score[i];
			} else {
				continue;
			}
		}
		
		sum = sum * 100 / max;
		System.out.println(sum/no);
		
		
	}
	
}