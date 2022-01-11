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
        int cnt = 0;
        while(stk.hasMoreTokens()){
            stk.nextToken();
            cnt++;
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}