import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> ordered_times = new PriorityQueue<>();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            ordered_times.add(Integer.parseInt(stk.nextToken()));
        }

        int result = 0;
        int cumulated = 0;
        for(int i = 0; i < N; i++){
            int tmp = ordered_times.poll();
            cumulated += tmp;
            result += cumulated;
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}
