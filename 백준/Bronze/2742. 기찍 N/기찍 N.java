import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();

		while(no > 0) {
			System.out.println(no);
			no--;
		}
	}
}