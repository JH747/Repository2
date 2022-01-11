import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        br.close();
        char[] n1 = stk.nextToken().toCharArray();
        char[] n2 = stk.nextToken().toCharArray();
        char tmp = n1[0];
        n1[0] = n1[2];
        n1[2] = tmp;
        tmp = n2[0];
        n2[0] = n2[2];
        n2[2] = tmp;
        int n11 = Integer.parseInt(String.valueOf(n1));
        int n22 = Integer.parseInt(String.valueOf(n2));

        if(n11 > n22) bw.write(Integer.toString(n11));
        else bw.write(Integer.toString(n22));
        bw.flush();
        bw.close();
    }
}
