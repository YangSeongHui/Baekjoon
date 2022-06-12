import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
   public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int num;
		Integer[] num1 = new Integer[41];
		Integer[] num2 = new Integer[41];
		num1[0] = 1;
		num1[1] = 0;
		num2[0] = 0;
		num2[1] = 1;

		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			for (int j = 2; j <= num; j++) {
				num1[j] = num1[j - 2] + num1[j - 1];
				num2[j] = num2[j - 2] + num2[j - 1];
			}
			bw.write(num1[num] + " " + num2[num] + "\n");
		}
		
		bw.close();
		br.close();

	}

}