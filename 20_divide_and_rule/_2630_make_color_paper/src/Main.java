import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // n 2 4 8 16 32 64 128
        int len = n;
        int[][] given_arr = new int[n+1][n+1];

        int cnt_w = 0;
        int cnt_b = 0;

        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                int color = Integer.parseInt(stk.nextToken());
                given_arr[i][j] = color;
                if(color == 0) cnt_w++;
                else cnt_b++;
            }
        }

        while(len >= 2){
            int[][] r_arr = new int[len/2][len/2];

            for(int i = 0; i < len; i += 2){
                for(int j = 0; j < len; j += 2){
                    if(given_arr[i][j] == 1 && given_arr[i][j+1] == 1 && given_arr[i+1][j] == 1 && given_arr[i+1][j+1] == 1){
                        r_arr[i/2][j/2] = 1;
                        cnt_b -= 3;
                    }
                    else if(given_arr[i][j] == 0 && given_arr[i][j+1] == 0 && given_arr[i+1][j] == 0 && given_arr[i+1][j+1] == 0){
                        r_arr[i/2][j/2] = 0;
                        cnt_w -= 3;
                    }
                    else{
                        r_arr[i/2][j/2] = -1;
                    }
                }
            }
            len /= 2;
            given_arr = r_arr;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cnt_w).append("\n").append(cnt_b);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
