import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n<3){
            System.out.println(1);
        }
        else{
            int[] dp = new int[n];

            dp[0] = 1;
            dp[1] = 1;

            for(int i = 2; i<n; i++){
                dp[i] = dp[i-2] + dp[i-1];
            }
            System.out.println(dp[n-1]);
        }
    }
}