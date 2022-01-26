import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][][] arr = new int[60][60][60];
        while (true){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int a, b, c;
            a = Integer.parseInt(stk.nextToken());
            b = Integer.parseInt(stk.nextToken());
            c = Integer.parseInt(stk.nextToken());
            if(a == -1 && b == -1 && c == -1) break;

            int result = func_w(a, b, c, arr);
            StringBuilder sb = new StringBuilder();
            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(")");
            sb.append(" = ").append(result).append("\n");
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }

    public static int func_w(int a, int b, int c, int[][][] arr){
        if(a <= 0 || b <= 0 || c <= 0) return 1;
        else if(arr[a][b][c] != 0) return arr[a][b][c];
        else{
            int tmp = -99;
            if(a > 20 || b > 20 || c > 20){
                tmp = func_w(20, 20, 20, arr);
            }
            else if(a < b && b < c){
                tmp = func_w(a, b, c-1, arr) + func_w(a, b-1, c-1, arr) - func_w(a, b-1, c, arr);
            }
            else{
                tmp = func_w(a-1,b,c,arr) + func_w(a-1,b-1,c,arr) + func_w(a-1,b,c-1,arr) - func_w(a-1,b-1,c-1,arr);
            }
            arr[a][b][c] = tmp;
            return tmp;
        }
    }
}
