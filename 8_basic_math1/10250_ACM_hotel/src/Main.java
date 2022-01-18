import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(stk.nextToken());
            int W = Integer.parseInt(stk.nextToken());
            int N = Integer.parseInt(stk.nextToken());

            int x = N / H;
            int y = N % H;
            String str;
            if(y == 0){
                str = Integer.toString(H);
                if(x < 10) str += ("0"+Integer.toString(x));
                else str += Integer.toString(x);
            }
            else{
                str = Integer.toString(y);
                if(x+1 < 10) str += ("0"+Integer.toString(x+1));
                else str += Integer.toString(x+1);
            }
            System.out.println(str);
        }
    }
}
