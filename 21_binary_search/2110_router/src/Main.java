import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int C;
    static int[] houses;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        C = Integer.parseInt(stk.nextToken());
        houses = new int[N];
        for(int i = 0; i < N; i++){
            houses[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(houses);
        System.out.println(func());
    }
    public static int func(){
        int min = 1;
        int max = houses[N-1] - houses[0];
        int mid = 0;
        while(min <= max){
            mid = (min+max)/2;
            if(isPossible(mid)){
                min = mid+1;
            }
            else{
                max = mid-1;
            }
        }
        return max;
    }
    public static boolean isPossible(int dis){
        int cnt = 1;
        int curr = houses[0];
        for(int i = 1; i < N; i++){
            if(houses[i] - curr >= dis){
                curr = houses[i];
                cnt++;
            }
        }
        return cnt >= C;
    }
}
