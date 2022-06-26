import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   ArrayList <Integer> list = new ArrayList<Integer>();
	   
	   for(int i=0; i<3; i++) {
		   int tmp = sc.nextInt();
		   list.add(tmp);
	   }
	   
	   Collections.sort(list);
	   System.out.println(list.get(1));
	   
   }
   
}		
	