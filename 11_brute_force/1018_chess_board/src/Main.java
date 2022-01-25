import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());
        char[][] given_board = new char[M][N];
        for(int i = 0; i < M; i++){
            given_board[i] = br.readLine().toCharArray();
        }
        // board ready above
        // str 로 비교하는게 나은가 char[] 로 비교하는게 나은가...

        String WB = "WBWBWBWB";
        String BW = "BWBWBWBW";

        char[][] WB_board = new char[8][8];


        for(int i = 0; i < M-8; i++){
            for(int j = 0; j < N-8; j++){
                for(int p = 0; p < 8; p++){
                    for(int q = 0; q < 8; q++){
                        given_board[p+i][q+j]
                    }
                }
            }
        }
    }
}
