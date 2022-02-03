import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        // dp[i] : biggest sum ends with index i
        // w[i] : cost of index i
        int[] dp = new int[n+1];
        int[] w = new int[n+1];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            w[i] = Integer.parseInt(stk.nextToken());
        }

        int max = dp[1] = w[1];

        for(int i = 2; i <= n; i++){
            int tmp;
            if(dp[i-1] > 0) tmp = dp[i-1] + w[i];
            else tmp = w[i];
            dp[i] = tmp;
            if(tmp > max) max = tmp;
        }

        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
    }
}
