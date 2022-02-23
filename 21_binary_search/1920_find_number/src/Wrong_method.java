import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Wrong_method {

    static int[] data;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        data = new int[N+1];
        for(int i = 1; i <= N; i++){
            data[i] = Integer.parseInt(stk.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(stk.nextToken());

            if(b_search(1, N, N, num)) System.out.println(1);
            else System.out.println(0);
        }
    }
    public static boolean b_search(int s, int f, int size, int k){
        if(size == 1){
            if(data[s] == k) return true;
            else return false;
        }
        else{
            if(size % 2 == 0){
                return b_search(s, s + size/2 - 1, size/2, k) || b_search(s + size/2, f, size/2, k);
            }
            else{
                return b_search(s, s + size/2 - 1, size/2, k) || b_search(s + size/2, f, size/2 + 1, k);
            }
            // 이거 아님. 나무위키 봐라. 
        }
    }
}
