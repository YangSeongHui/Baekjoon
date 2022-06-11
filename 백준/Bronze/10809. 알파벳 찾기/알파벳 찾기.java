import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      
      int[] num = new int[26];
      
      for(int i=0; i<26; i++) {
    	  num[i] = s.indexOf(97+i);
    	  System.out.print(num[i]+" ");
    	  
      }
      
   }
   
}