import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            arraylist.add(Integer.parseInt(st.nextToken()));
        }
        
        Collections.sort(arraylist);
        StringBuilder sb = new StringBuilder();
        for(Integer i : arraylist) {
            bw.write(String.valueOf(i)+"\n");
        }
        bw.flush();
        bw.close();
        
    }
}