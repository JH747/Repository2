import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        // dp_increase[i] : length of longest increasing sequence ends with i_th element
        // dp_decrease[i] : length of longest decreasing sequence ends with i_th element(from back)
        // w[i] : cost of i_th element
        int[] dp_increase = new int[N+1];
        int[] dp_decrease = new int[N+1];
        int[] w = new int[N+1];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            w[i] = Integer.parseInt(stk.nextToken());
        }

        if(N == 1){
            bw.write("1");
        }
        else{
            dp_increase[1] = 1;
            for(int i = 2; i <= N; i++){
                int tmp = 0;
                for(int j = i-1; j >=1; j--){
                    if(w[i] > w[j] && dp_increase[j] > tmp) tmp = dp_increase[j];
                }
                dp_increase[i] = tmp + 1;
            }

            dp_decrease[N] = 1;
            for(int i = N-1; i >= 1; i--){
                int tmp = 0;
                for(int j = i+1; j <= N; j++){
                    if(w[i] > w[j] && dp_decrease[j] > tmp) tmp = dp_decrease[j];
                }
                dp_decrease[i] = tmp + 1;
            }

            int cnt = 0;
            for(int i = 1; i <= N; i++){
                int tmp = dp_increase[i] + dp_decrease[i] - 1;
                if(tmp > cnt) cnt = tmp;
            }

            bw.write(Integer.toString(cnt));
        }
        bw.flush();
        bw.close();

    }
}
