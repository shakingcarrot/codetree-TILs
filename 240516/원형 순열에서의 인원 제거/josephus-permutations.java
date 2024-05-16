import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < M-1; j++) {
                Integer x = q.poll();
                q.offer(x);
            }
            bw.write(q.poll()+"");
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}