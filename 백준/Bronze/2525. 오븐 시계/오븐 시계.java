import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt(), m = sc.nextInt();
        int ct = sc.nextInt();
        int hNm = 0;
        int time = 0;
        
        if (h>=0 && h<=23 && m>=0 && m<=59) {
            hNm = h*60;
            time = hNm + m + ct;
            h = time / 60;
            m = time % 60;
        }
        if (h >= 24) {
            h = h-24;
        }
        System.out.println(h + " " + m);
    }
}