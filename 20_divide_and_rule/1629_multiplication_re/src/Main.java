import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(stk.nextToken());
        long B = Integer.parseInt(stk.nextToken());
        long C = Integer.parseInt(stk.nextToken());

        bw.write(Long.toString(mul(A, B, C)));
        bw.flush();
        bw.close();
    }

    public static long mul(long a, long b, long c){
        if(b < 2){
            return a%c;
        }

        else{
            long tmp = mul(a, b/2, c);

            if(b % 2 == 0){
                return (tmp*tmp)%c; // tmp는 int 범위 안의 수이므로 한 번의 제곱까지는 long 이 버틸 수 있다.
            }
            else{
                return (((tmp*tmp)%c) * a) % c; // a 또한 int 범위 안의 수이므로 이렇게 할 수 있다.
            }
        }
    }
}
