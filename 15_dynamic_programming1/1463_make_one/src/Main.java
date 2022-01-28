import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+10];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for(int i = 4; i <= N; i++){
            int tmp = dp[i-1] + 1;
            if(i % 3 == 0) tmp = Math.min(tmp, dp[i/3] + 1);
            if(i % 2 == 0) tmp = Math.min(tmp, dp[i/2] + 1);
            dp[i] = tmp;
        }
        //int result = func(N, dp);
        bw.write(Integer.toString(dp[N]));
        bw.flush();
        bw.close();
    }

    public static int func(int i, int[] dp){
        if(dp[i] != 0) return dp[i];
        else{
            if(i == 1) return 0;
            else{
                int tmp = func(i-1, dp) + 1;
                if(i % 3 == 0) tmp = Math.min(tmp, func(i/3, dp) + 1);
                if(i % 2 == 0) tmp = Math.min(tmp, func(i/2, dp) + 1);
                dp[i] = tmp;
                return tmp;
            }
        }
    }
}
