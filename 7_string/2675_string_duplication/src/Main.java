import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        // manage each line by line
        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(stk.nextToken());
            String given_str = stk.nextToken();
            String result_str = "";
            for(int j = 0; j < given_str.length(); j++){
                for(int k = 0; k < m; k++){
                    result_str += given_str.charAt(j);
                }
            }
            bw.write(result_str + "\n");
            bw.flush();
        }
        br.close();
        //bw.flush();
        bw.close();
    }
}
