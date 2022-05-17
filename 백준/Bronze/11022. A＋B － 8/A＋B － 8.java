import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			int res = no1 + no2;
			
			System.out.println("Case #" + (i+1) + ": " + no1 + " + "+ no2 + " = " + res);
		}
	}
}
