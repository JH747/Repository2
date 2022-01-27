import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] C = new int[n+1][n+1];
        int[][] W = new int[n+1][n+1];
        // i : floor, from 1 to n
        // j : integers, from 0 to 1,2,3, ... , n-1
        for(int i = 1; i <= n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < i; j++){
                W[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        int result = 0;
        for(int i = 0; i < n; i++){
            int tmp = func(n, i, C, W);
            if(result < tmp){
                result = tmp;
            }
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }

    public static int func(int p, int q, int[][] c, int[][] w){
        if(p == 1){
            c[p][q] = w[p][q];
            return w[p][q];
        }
        else{
            if(c[p][q] != 0) return c[p][q];
            else{
                int tmp;
                if(q == 0) tmp = func(p-1, 0, c, w) + w[p][q]; // if first of floor get value only from its index of previous floor
                else if(q == p-1) tmp = func(p-1, q-1, c, w) + w[p][q]; // if lsat of floor get value only from its index-1 of previous floor
                else tmp = Math.max(func(p-1, q-1, c, w), func(p-1, q, c, w)) + w[p][q];
                c[p][q] = tmp;
                return tmp;
            }
        }
    }
}
