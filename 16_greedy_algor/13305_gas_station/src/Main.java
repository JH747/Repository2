import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long[] dist = new long[N+1];
        int[] g_cost = new int[N+1];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N-1; i++){
            dist[i] = Integer.parseInt(stk.nextToken());
        }
        stk = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            g_cost[i] = Integer.parseInt(stk.nextToken());
        }

        long result = 0;
        long current_cost = g_cost[1];
        for(int i = 1; i <= N-1; i++){
            if(current_cost > g_cost[i]) current_cost = g_cost[i];
            result += current_cost * dist[i];
        }

        bw.write(Long.toString(result));
        bw.flush();
        bw.close();
    }
}
