import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> i_deque = new ArrayDeque<>();
        for(int i = 0; i < N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            switch (stk.nextToken()){
                case "push_front":
                    i_deque.offerFirst(Integer.parseInt(stk.nextToken()));
                    break;
                case "push_back":
                    i_deque.offerLast(Integer.parseInt(stk.nextToken()));
                    break;
                case "pop_front":
                    try{
                        bw.write(i_deque.removeFirst().toString());
                    }
                    catch (NoSuchElementException e){
                        bw.write("-1");
                    }
                    bw.write("\n");
                    break;
                case "pop_back":
                    try{
                        bw.write(i_deque.removeLast().toString());
                    }
                    catch (NoSuchElementException e){
                        bw.write("-1");
                    }
                    bw.write("\n");
                    break;
                case "size":
                    bw.write(Integer.toString(i_deque.size()));
                    bw.write("\n");
                    break;
                case "empty":
                    if(i_deque.isEmpty()) bw.write("1");
                    else bw.write("0");
                    bw.write("\n");
                    break;
                case "front":
                    try{
                        bw.write(i_deque.getFirst().toString());
                    }
                    catch (NoSuchElementException e){
                        bw.write("-1");
                    }
                    bw.write("\n");
                    break;
                case "back":
                    try{
                        bw.write(i_deque.getLast().toString());
                    }
                    catch (NoSuchElementException e){
                        bw.write("-1");
                    }
                    bw.write("\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
