import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[N];
        arr1[0] = Integer.parseInt(st.nextToken());
        int[] arr2 = new int[N];
        for(int i = 1; i < N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = arr1[i-1]+arr1[i];
        }
        Arrays.sort(arr2);
        System.out.println(arr2[N-1]);
    }
}