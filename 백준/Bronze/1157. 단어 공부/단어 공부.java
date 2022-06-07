import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		
		String str = sc.next().toUpperCase();
		char maxStr = ' ';
		
		int[] alphabet = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			
			alphabet[str.charAt(i)-65]++;
			if(max < alphabet[str.charAt(i)-65]) {
				max = alphabet[str.charAt(i)-65];
				maxStr = str.charAt(i);
			} else if(max == alphabet[str.charAt(i)-65]) {
				maxStr = '?';
			}
			
		}
		
		System.out.println(maxStr);
		
	}
	
}