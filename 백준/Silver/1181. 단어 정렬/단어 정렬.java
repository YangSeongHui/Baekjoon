import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		
		sc.nextLine();
		
		for(int i=0; i<N; i++) {
			str[i] = sc.nextLine();
		}
		
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String str1, String str2) {
				if(str1.length() == str2.length()) {
					return str1.compareTo(str2);
				} else {
					return str1.length() - str2.length();
				}
			}
			
		});
		
		System.out.println(str[0]);
		
		for(int i=1; i<N; i++) {
			if(!str[i].equals(str[i-1])) {
				System.out.println(str[i]);
			}
			
		}
			
	}
	
}