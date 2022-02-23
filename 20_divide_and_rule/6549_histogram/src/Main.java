import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            if(str.equals("0")) break;

            rec[] dp = new rec[100001];
            for(int i = 0; i < 100001; i++){
                dp[i] = new rec(0,0,0);
            }
            StringTokenizer stk = new StringTokenizer(str);


            dp[1].size = Long.parseLong(stk.nextToken());
            dp[1].last = 1;
            int cnt = 2;
            while(stk.hasMoreTokens()){
                long h = Long.parseLong(stk.nextToken());

                if(dp[cnt-1].last != cnt-1){
                    long tmp = Math.max(cnt, h);
                    if(tmp < dp[cnt-1].size) dp[cnt] = dp[cnt-1];
                    else{
                        if(h < cnt){
                            dp[cnt].height = 1;
                        }
                        else{
                            dp[cnt].height = h;
                        }
                        dp[cnt].size = tmp;
                        dp[cnt].last = cnt;
                    }
                }
                else{
                    if(h >= dp[cnt-1].height){
                        dp[cnt].size = (dp[cnt-1].size/dp[cnt-1].height + 1) * dp[cnt-1].height;
                        dp[cnt].last = cnt;
                        dp[cnt].height = dp[cnt-1].height;
                    }
                    else{
                        dp[cnt].size = (dp[cnt-1].size/dp[cnt-1].height + 1) * h;
                        dp[cnt].last = cnt;
                        dp[cnt].height = h;
                    }

                    if(dp[cnt].size < h || dp[cnt].size < cnt){
                        if(h < cnt){
                            dp[cnt].height = 1;
                            dp[cnt].size = cnt;
                        }
                        else{
                            dp[cnt].height = h;
                            dp[cnt].size = h;
                        }
                    }
                }
                cnt++;
            }

            System.out.println(dp[cnt].size);

        }
    }
}

class rec{
    long size;
    long height;
    int last;

    public rec(long size, long height, int last) {
        this.size = size;
        this.height = height;
        this.last = last;
    }
}