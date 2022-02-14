import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String command = br.readLine();
            int len = Integer.parseInt(br.readLine());
            String arr_str = br.readLine();

            StringTokenizer stk = new StringTokenizer(arr_str.substring(1, arr_str.length()-1), ",");
            Deque<Integer> arr = new LinkedList<>();
            for(int j = 0; j < len; j++){
                arr.offerLast(Integer.parseInt(stk.nextToken()));
            }

            boolean error = false;
            int reversed = -1;

            for(int j = 0; j < command.length(); j++){
                if(command.charAt(j) == 'R'){
                    //Collections.reverse((List)arr); // 이대로 하면 시간 너무 오래 걸린다.
                    reversed *= -1;
                }
                else{
                    if(arr.size() == 0){
                        bw.write("error");
                        error = true;
                        break;
                    }
                    else{
                        if(reversed == 1) arr.removeLast();
                        else arr.removeFirst();
                    }
                }
            }

            if(reversed == 1) Collections.reverse((List)arr);

            if(!error){
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                int m = arr.size();
                for(int j = 0; j < m-1; j++){
                    sb.append(arr.removeFirst()).append(',');
                }
                if(m != 0) sb.append(arr.removeFirst());
                sb.append(']');
                bw.write(sb.toString());
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    // 실제로 reverse 시키는 대신 reverse 된 것처럼 deque로 구현
}
