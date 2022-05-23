import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];
		int max = arr[0];
		int j, sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(j=0; j<arr.length; j++) {
			if(max < arr[j]) {
				max = arr[j];
				sum = j;
			}
		}
		System.out.println(max);
        System.out.println(sum+1);
	}
}
