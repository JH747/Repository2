import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            double distance = b - a;
            int max_dis = (int)Math.sqrt(distance);
            double remain = distance - max_dis*max_dis;
            int additional_flies = (int)Math.ceil(remain/max_dis);

            System.out.println((max_dis + max_dis-1 + additional_flies));
        }
    }
}
