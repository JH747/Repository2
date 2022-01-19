import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> prime_num = new PriorityQueue<>();
        int sum = 0;
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
            if(prime){
                sum += i;
                prime_num.add(i);
            }
        }
        if(sum == 0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(prime_num.poll());
        }
    }
}
