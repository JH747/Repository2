import java.io.*;
import java.util.*;

public class Main_binary {

    static int N;
    static int Target;
    static int[] s_card;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        s_card = new int[N];

        for (int i = 0; i < N; i++) {
            s_card[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(s_card);

        int M = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            Target = Integer.parseInt(stk.nextToken());
            bw.write(Integer.toString(upper_index() - lower_index()));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }

    // https://blog.encrypted.gg/985 참고

    public static int lower_index(){
        int st = 0;
        int en = N;
        while(st < en){
            int mid = (st+en)/2;
            if(s_card[mid] >= Target) en = mid;
            else st = mid + 1;
        }
        return st;
    }
    public static int upper_index(){
        int st = 0;
        int en = N;
        while(st < en){
            int mid = (st+en)/2;
            if(s_card[mid] > Target) en = mid;
            else st = mid + 1;
        }
        return st;
    }
}