import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		StringBuffer sb1 = new StringBuffer(str1);
		StringBuffer sb2 = new StringBuffer(str2);
		str1 = sb1.reverse().toString();
		str2 = sb2.reverse().toString();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		if(num1>num2)
			System.out.println(num1);
		else
			System.out.println(num2);
		
	}
	
}
