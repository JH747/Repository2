import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int K;
    static int N;
    static List<Integer> lengths;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        K = Integer.parseInt(stk.nextToken());
        N = Integer.parseInt(stk.nextToken());
        lengths = new ArrayList<>();
        for(int i = 0; i < K; i++){
            lengths.add(Integer.parseInt(br.readLine()));
        }
        lengths.sort(Comparator.reverseOrder());
        // K <= N 이므로 각 케이블 당 반드시 하나 이상의 랜선이 나와야 한다. 그러니 케이블 중 가장 작은 길이로 시작하는 것

        System.out.println(LAN_func());
    }

    public static int LAN_func(){
        int st = 1;
        int en = lengths.get(0);
        int cnt = 0;
        int mid = 0;
        while(st <= en){
            mid = (st+en)/2;
            for(int len : lengths) cnt += len/mid;
            // 여기에서 en은 마지막까지 N을 만족하는지 확인 할 수 없으므로 구해진 st를 재검증 해야 하는 것으로 보인다.
            // cnt < N 이면 더 단위길이가 더 줄어들어야 함을 의미 즉 en을 mid로 바꾸어도 en이 조건을 만족한다 할 수는 없다.
            if(cnt < N){
                st = mid+1;
                //en = mid-1;
            }
            else{
                en = mid-1;
                //st = mid+1;
            }
            // cnt >= N 이면 더 단위길이가 더 늘어나거나 같아야함을 의미.
            // 즉 cnt = N 인 경우에 발동하면 st = mid+1을 하게 되면 조건을 만족하지 않을 수 있다.
        }
        return en;

//        cnt = 0;
//        for(int len : lengths) cnt += len/st;
//        int p = 0;
//        // 충분한 경우에는 충분하지 않아질 때까지 단위길이를 늘린다.
//        while(cnt >= N){
//            st++;
//            cnt = 0;
//            for(int len : lengths) cnt += len/st;
//        }
//
//        p = 1;
//        // 충분하지 않은 경우에는 충분해질 때까지 단위길이를 줄인다. 위와 독립적이지 않음.
//        while(cnt < N){
//            st--;
//            cnt = 0;
//            for(int len : lengths) cnt += len/st;
//        }
//
//        p = 2;
//        return st;
    }
}
