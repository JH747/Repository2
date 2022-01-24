import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int x1, y1, r1, x2, y2, r2;
        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(stk.nextToken());
            y1 = Integer.parseInt(stk.nextToken());
            r1 = Integer.parseInt(stk.nextToken());
            x2 = Integer.parseInt(stk.nextToken());
            y2 = Integer.parseInt(stk.nextToken());
            r2 = Integer.parseInt(stk.nextToken());

            int result = 10;
            double d_square = (Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
            if(d_square == 0){
                if(r1 == r2) result = -1;
                else result = 0;
            }
            else{
                if(d_square < Math.pow(r1-r2, 2)) result = 0;
                else if(d_square == Math.pow(r1-r2, 2)) result = 1;
                else if(d_square < Math.pow(r1+r2, 2)) result = 2;
                else if(d_square == Math.pow(r1+r2, 2)) result = 1;
                else result = 0;
            }
            bw.write(Integer.toString(result)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
