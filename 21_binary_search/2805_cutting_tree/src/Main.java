import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static long M;
    static long[] Trees;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        Trees = new long[N];
        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            Trees[i] = Long.parseLong(stk.nextToken());
        }
        Arrays.sort(Trees);
        //for(int i = 0; i < N; i++) System.out.println(Trees[i]);

        System.out.println(func());
    }

    public static long func(){
        long st = 0;
        long en = Trees[N-1];
        long mid = 0;
        while(st <= en){ // 등호가 붙음에 주의할 것. 기준값을 넘어가며 st = en 이 되는 경우에 이를 보정하기 위함
            mid = (st+en)/2;
            if(cutting(mid) >= M){ // 무한반복 방지. st = en-1 or en 일때 +1 안하면 무한루프에 진입한다.
                st = mid+1;
            }
            else{
                en = mid-1; // 조건 만족 못하니 current mid는 범위 밖인 것이 당연
            }
        }
        return en;
    }

    public static long cutting(long c){
        long total = 0;
        for(long len : Trees){
            long tmp = len - c;
            if(tmp > 0) total += tmp;
        }
        return total;
    }
}
