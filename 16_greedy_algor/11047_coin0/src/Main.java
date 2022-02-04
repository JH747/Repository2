import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());

        int[] coins = new int[N+1];
        for(int i = 1; i <= N; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int i = N; i >= 1; i--){
            int quotient = K / coins[i];
            if(quotient != 0){
                cnt += quotient;
                K -= quotient * coins[i];
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
