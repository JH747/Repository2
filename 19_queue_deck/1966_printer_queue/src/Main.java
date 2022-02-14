import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ntk = Integer.parseInt(br.readLine());
        for(int i = 0; i < ntk; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(stk.nextToken());
            int K = Integer.parseInt(stk.nextToken());
            stk = new StringTokenizer(br.readLine());
            Queue<document> documents = new LinkedList<>();
            List<Integer> im_list = new ArrayList<>();

        }
    }
}

class document implements Comparable<document>{
    int index;
    int importance;

    public document(int index, int importance) {
        this.index = index;
        this.importance = importance;
    }

    @Override
    public int compareTo(document o){
        if(this.importance == o.importance) return this.index - o.index;
        else return this.importance-o.importance;
    }
}