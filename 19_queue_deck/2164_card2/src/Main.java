import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> i_queue = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            i_queue.offer(i);
        }

        int trash = -1;
        while(i_queue.size() > 1){
            if(trash == -1){
                i_queue.remove();
            }
            else{
                int tmp = i_queue.poll();
                i_queue.offer(tmp);
            }
            trash *= -1;
        }

        bw.write(Integer.toString(i_queue.poll()));
        bw.flush();
        bw.close();
    }
}
