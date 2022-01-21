import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String str = br.readLine();
            if(str.equals("0 0 0")) break;
            StringTokenizer stk = new StringTokenizer(str);
            List<Integer> lengths = new ArrayList<>();
            for(int i = 0; i < 3; i++) lengths.add(Integer.parseInt(stk.nextToken()));
            boolean rect = false;
            for(int i = 0; i < 3; i++){
                if(Math.pow(lengths.get(0), 2) == Math.pow(lengths.get(1), 2) + Math.pow(lengths.get(2), 2)){
                    rect = true;
                    break;
                }
                int tmp = lengths.get(0);
                lengths.remove(0);
                lengths.add(tmp);
            }
            if(rect) bw.write("right\n");
            else bw.write("wrong\n");
        }
        bw.flush();
        bw.close();
    }
}
