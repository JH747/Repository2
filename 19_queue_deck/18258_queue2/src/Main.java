import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> I_queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            switch (stk.nextToken()){
                case "push":
                    I_queue.add(Integer.parseInt(stk.nextToken()));
                    break;

                case "pop":
                    if(I_queue.size() == 0) bw.write("-1");
                    else{
                        bw.write(Integer.toString(I_queue.get(0)));
                        I_queue.remove(0);
                    }
                    bw.newLine();
                    break;

                case "size":
                    bw.write(Integer.toString(I_queue.size()));
                    bw.newLine();
                    break;

                case "empty":
                    if(I_queue.size() == 0) bw.write("1");
                    else bw.write("0");
                    bw.newLine();
                    break;

                case "front":
                    if(I_queue.size() == 0) bw.write("-1");
                    else{
                        bw.write(Integer.toString(I_queue.get(0)));
                    }
                    bw.newLine();
                    break;

                case "back":
                    int tmp = I_queue.size();
                    if(tmp == 0) bw.write("-1");
                    else{
                        bw.write(Integer.toString(I_queue.get(tmp-1)));
                    }
                    bw.newLine();
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
