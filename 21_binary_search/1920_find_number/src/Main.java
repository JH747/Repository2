import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static List<Integer> data;
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        data = new ArrayList<>();
        for(int i = 0; i < N; i++) data.add(Integer.parseInt(stk.nextToken()));
        data.sort(Comparator.naturalOrder());

        int M = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            K = Integer.parseInt(stk.nextToken());

            if(b_search(0, N)) System.out.println(1);
            else System.out.println(0);
        }
    }
    public static boolean b_search(int s, int size){
        if(size < 3){
            if(size == 1){
                return data.get(s) == K;
            }
            else{
                return data.get(s) == K || data.get(s + 1) == K;
            }
        }
        else{
            int mid = data.get(s + size/2);
            if(mid == K) return true;

            if(size%2 == 0){
                if(mid < K) return b_search(s + size/2 + 1, size/2 - 1);
                else return b_search(s, size/2);
            }
            else{
                if(mid < K) return b_search(s + size/2 + 1, size/2);
                else return b_search(s, size/2);
            }
        }
    }
}
