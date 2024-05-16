import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> hs = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        int x;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            x = Integer.parseInt(st.nextToken());
            hs.add(x);
        }
        bw.write(hs.size()+"");
        bw.flush();
        bw.close();
    }
}