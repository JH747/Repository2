import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());
        PriorityQueue<Integer> prime_num = new PriorityQueue<>();

        for(int i = M; i <= N; i++){
            boolean prime = true;
            if(i == 1){
                prime = false;
            }
            int mid_val = (int)Math.sqrt(i);
            for(int j = 2; j <= mid_val; j++){
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime) prime_num.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while(true){
            int tmp;
            try{
                tmp = prime_num.poll();
            }
            catch (Exception e){
                break;
            }
            sb.append(tmp).append("\n");
        }
        System.out.print(sb.toString());
    }
}