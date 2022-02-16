import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        BigInteger C = new BigInteger(stk.nextToken());

        while(B > 0){
            A = A.multiply(A);
            B--;
        }

        String result = A.remainder(C).toString();

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
