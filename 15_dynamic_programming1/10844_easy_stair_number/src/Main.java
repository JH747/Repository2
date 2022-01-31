import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        // dp[i][j] = number of stairnums that ends with j when N = i
        long[][] dp = new long[N+1][10];

        for(int i = 1; i < 10; i++) dp[1][i] = 1;

        for(int i = 2; i <= N; i++){
            for(int j = 0; j <= 9; j++){
                if(j == 0) dp[i][j] = dp[i-1][j+1];
                else if(j == 9) dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];

                dp[i][j] %= 1000000000;
            }
        }
        long result = 0;
        for(int i = 0; i < 10; i++){
            result += dp[N][i];
        }
        result %= 1000000000;
        bw.write(Long.toString(result));
        bw.flush();
        bw.close();
    }
}
