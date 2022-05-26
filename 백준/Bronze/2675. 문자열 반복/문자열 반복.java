import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			int no1 = sc.nextInt();
			String str = sc.next();
			for(int j=0; j<str.length(); j++) {
				char a = str.charAt(j);
				for(int no2=0; no2<no1; no2++) {
					System.out.print(a);
				}
			}
			
			System.out.println();
			
		}
	}
}