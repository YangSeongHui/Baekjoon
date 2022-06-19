import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
   public static void main(String[] args) throws IOException  {
		
	   Scanner sc = new Scanner(System.in);
	   
	   Integer arr[] = new Integer[10];
	   int i = 0;
	   
	   while(i<=9) {
		   arr[i] = sc.nextInt()%42;
		   i++;
		   
	   }
	   
	   Set<Integer> arrSet = new HashSet<Integer>(Arrays.asList(arr));
	   
	   System.out.println(arrSet.size());
	   
   }
   
}		
	