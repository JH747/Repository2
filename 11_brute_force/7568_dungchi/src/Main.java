import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<info> p_info = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            p_info.add(new info(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())));
        }

        List<info> n_info = new ArrayList<>(p_info);
        Collections.sort(n_info, Collections.reverseOrder());

        //n_info.get(0).w = -1;

        for(info i : p_info){
            System.out.println(i.w);
        }

        int act_rank = 1;
        int pas_rank = 1;


    }
}

class info implements Comparable<info>{
    int w;
    int h;
    int rank = 0;

    public info(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public int compareTo(info o){
        return this.w - o.w;
    }
}
