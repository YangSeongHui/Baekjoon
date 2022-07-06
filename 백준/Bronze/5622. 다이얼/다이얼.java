import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		String str = sc.next();
		
		str = str.replaceAll("A","2");
		str = str.replaceAll("B","2");
		str = str.replaceAll("C","2");
		str = str.replaceAll("D","3");
		str = str.replaceAll("E","3");
		str = str.replaceAll("F","3");
		str = str.replaceAll("G","4");
		str = str.replaceAll("H","4");
		str = str.replaceAll("I","4");
		str = str.replaceAll("J","5");
		str = str.replaceAll("K","5");
		str = str.replaceAll("L","5");
		str = str.replaceAll("M","6");
		str = str.replaceAll("N","6");
		str = str.replaceAll("O","6");
		str = str.replaceAll("P","7");
		str = str.replaceAll("Q","7");
		str = str.replaceAll("R","7");
		str = str.replaceAll("S","7");
		str = str.replaceAll("T","8");
		str = str.replaceAll("U","8");
		str = str.replaceAll("V","8");
		str = str.replaceAll("W","9");
		str = str.replaceAll("X","9");
		str = str.replaceAll("Y","9");
		str = str.replaceAll("Z","9");
		
		for(int i=0;i<str.length();i++) {
			sum += Integer.parseInt(str.substring(i,i+1));
		}

		System.out.println(sum+str.length());
		
	}
    
}
