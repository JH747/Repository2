import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<conference> conferences = new PriorityQueue<>();

        for(int i = 1; i <= N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            conferences.add(new conference(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())));
        }

        // greedy by end time
        int cnt = 0;
        int current_e_time = 0;
        for(int i = 1; i <= N; i++){
            conference tmp_c = conferences.poll();
            if(tmp_c.start >= current_e_time){
                current_e_time = tmp_c.end;
                cnt++;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}
class conference implements Comparable<conference>{
    int start;
    int end;

    public conference(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(conference o){
        if(end == o.end) return start - o.start; // mandatory!
        else return end - o.end;
        //2
        //2 2
        //1 2
    }
}