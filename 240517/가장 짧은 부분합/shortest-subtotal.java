import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int ans = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sumVal=0;
        int j =0;
        for(int i = 0; i<n; i++){
            while(j < n && sumVal<s){
                sumVal += arr[j];
                j++;
            }
            if(sumVal<s){
                break;
            }
            ans = Math.min(ans, j-i);
            sumVal -= arr[i];
        }
        if(ans==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }

    }
}