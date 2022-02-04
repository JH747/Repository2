import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());

        // dp[i][j] : maximum value sum if up to i_th element, with bag capacity j
        // 1부터 N개의 모든 물건들을 살펴보고, 배낭 용량이 K였을 때 이 배낭에 들어가 있는 물건들의 가치합의 최댓값
        // W[i] : weight of i_th element
        // V[i] : value of i_th element
        int[][] dp = new int[N+1][K+1];
        int[] W = new int[N+1];
        int[] V = new int[N+1];

        for(int i = 1; i <= N; i++){
            stk = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(stk.nextToken());
            V[i] = Integer.parseInt(stk.nextToken());
        }
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= K; j++){
                if(j >= W[i]){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-W[i]] + V[i]);
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        bw.write(Integer.toString(dp[N][K]));
        bw.flush();
        bw.close();
    }
}
