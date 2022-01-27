import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] C = new int[1001][1001];
        int[][] W = new int[1001][1001];
        // R G B = 0 1 2
        for(int i = 1; i <= N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                W[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        int r0 = func(N, 0, C, W);
        int r1 = func(N, 1, C, W);
        int r2 = func(N, 2, C, W);
        int result = Math.min(r0, r1);
        result = Math.min(result, r2);
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
    // R G B = 0 1 2
    // c[p][q] : min total cost when p.th house is painted as q color
    // w[p][q] : cost to paint p.th house as q color

    public static int func(int p, int q, int[][] c, int[][] w){
        if(c[p][q] != 0) return c[p][q];
        else{
            if(p == 1){
                c[p][q] = w[p][q];
                return w[p][q];
            }
            else{
                int tmp;
                if(q == 0) tmp = Math.min(func(p-1, 1, c, w), func(p-1, 2, c, w)) + w[p][q];
                else if(q == 1) tmp = Math.min(func(p-1, 0, c, w), func(p-1, 2, c, w)) + w[p][q];
                else tmp = Math.min(func(p-1, 0, c, w), func(p-1, 1, c, w)) + w[p][q];
                c[p][q] = tmp;
                return tmp;
            }
        }
    }
}
