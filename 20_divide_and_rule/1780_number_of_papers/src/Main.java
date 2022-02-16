import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int neg_one_cnt = 0;
    static int pos_one_cnt = 0;
    static int zero_cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        for(int i = 0; i < N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        //
        partition(0, 0, N);

        StringBuilder sb = new StringBuilder();
        sb.append(neg_one_cnt).append("\n").append(zero_cnt).append("\n").append(pos_one_cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    public static void partition(int ver, int hor, int size){
        if(determine(ver, hor, size)){
            switch (arr[ver][hor]){
                case -1:
                    neg_one_cnt++;
                    break;
                case 0:
                    zero_cnt++;
                    break;
                case 1:
                    pos_one_cnt++;
                    break;
            }
            return;
        }
        int th_size = size/3;
        partition(ver, hor, th_size);
        partition(ver, hor + th_size, th_size);
        partition(ver, hor + th_size*2, th_size);

        partition(ver + th_size, hor, th_size);
        partition(ver + th_size, hor + th_size, th_size);
        partition(ver + th_size, hor + th_size*2, th_size);

        partition(ver + th_size*2, hor, th_size);
        partition(ver + th_size*2, hor + th_size, th_size);
        partition(ver + th_size*2, hor + th_size*2, th_size);

    }
    public static boolean determine(int ver, int hor, int size){
        int num = arr[ver][hor];

        for(int i = ver; i < ver + size; i++){
            for(int j = hor; j < hor + size; j++){
                if(arr[i][j] != num) return false;
            }
        }
        return true;
    }
}
