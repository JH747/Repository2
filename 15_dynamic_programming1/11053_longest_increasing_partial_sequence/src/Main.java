import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());

        //w[i] :
        //dp[i] : max value of partial sequence ends with i_th digit
        int[] w = new int[N+1];
        int[] dp = new int[N+1];
        for(int i = 1; i <= N; i++){
            w[i] = Integer.parseInt(stk.nextToken());
        }
        dp[1] = 1;

        int max = 1;
        for(int i = 2; i <= N; i++){
            int tmp = 0;
            for(int j = i-1; j >= 1; j--){
                if(w[i] > w[j] && dp[j] > tmp) tmp = dp[j]; // among j (j < i) that w[j] < w[i], find j with largest dp[j] value.
            }
            dp[i] = tmp + 1;
            if(dp[i] > max) max = dp[i]; // has to consider cases that dp[N] is not max value
        }

        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
    }
}
