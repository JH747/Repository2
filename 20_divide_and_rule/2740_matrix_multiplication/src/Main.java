import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        int[][] arr_A = new int[N][M];
        for(int i = 0; i < N; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr_A[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        stk = new StringTokenizer(br.readLine());
        M = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());
        int[][] arr_B = new int[M][K];
        for(int i = 0; i < M; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < K; j++){
                arr_B[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        int[][] result = new int[N][K];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < K; j++){
                for(int l = 0; l < M; l++){
                    result[i][j] += arr_A[i][l] * arr_B[l][j];
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < K; j++){
                bw.write(Integer.toString(result[i][j]));
                bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
