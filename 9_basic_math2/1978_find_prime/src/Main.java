import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int cnt = n;
        for(int i = 0; i < n; i++){
            int candidate = Integer.parseInt(stk.nextToken());
            if(candidate == 1){
                cnt--;
                continue;
            }
            int mid_val = (int)Math.sqrt(candidate);
            for(int j = 2; j <= mid_val; j++){
                if(candidate % j == 0){
                    cnt--;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
