import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int res = A * B * C;
		int[] arr = new int[10];
		while (res>0) {
			arr[res%10]++;
			
			res /= 10;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
}