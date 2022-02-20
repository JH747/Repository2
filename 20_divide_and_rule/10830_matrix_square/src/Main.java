import java.io.*;

import java.util.StringTokenizer;

public class Main {

    static int[][] arr_A;
    static int[][] result;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        long B = Long.parseLong(stk.nextToken());

        arr_A = new int[N][N];
        result = new int[N][N];

        for(int i = 0; i < N; i++){
            stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr_A[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        result = matrix_squaring(arr_A, B);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                bw.write(Integer.toString(result[i][j]%1000)); // 1000 1000 1000 1000 인 경우 고려해야 함.
                bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static int[][] matrix_squaring(int[][] arr, long t){
        if(t == 1){
            return arr;
        }

        else{
            int[][] tmp = matrix_squaring(arr, t/2);
            tmp = matrix_mul(tmp, tmp);
            if(t % 2 != 0) tmp = matrix_mul(tmp, arr_A);
            return tmp;
        }
    }

    public static int[][] matrix_mul(int[][] arr1, int[][] arr2){

        int[][] arr3 = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                int tmp = 0;
                for(int l = 0; l < N; l++){
                    tmp += arr1[i][l] * arr2[l][j];
                }
                arr3[i][j] = tmp % 1000;
            }
        }
        return arr3;
    }
}
