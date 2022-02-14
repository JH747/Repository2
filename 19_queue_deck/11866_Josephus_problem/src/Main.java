import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());

        Queue<Integer> i_queue = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            i_queue.offer(i);
        }

        List<Integer> result = new ArrayList<>();

        int control = 1;
        while(i_queue.size() >= 1){
            if(control < K){
                i_queue.offer(i_queue.poll());
                control++;
            }
            else{
                result.add(i_queue.poll());
                control -= (K-1);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 0; i < result.size()-1; i++){
            sb.append(result.get(i)).append(", ");
        }
        sb.append(result.get(result.size()-1)).append(">");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
