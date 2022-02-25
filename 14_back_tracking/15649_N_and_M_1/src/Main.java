import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static Stack<Integer> STACK;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());

        STACK = new Stack<>();
        DFS();
        bw.flush();
        bw.close();

    }
    //https://www.acmicpc.net/board/view/84354 참고할 것!

    public static void DFS() throws IOException{
        if(STACK.size() == M){
            for(int i : STACK){
                bw.write(Integer.toString(i) + " ");
            }
            bw.newLine();
        }
        else{
            for(int i = 1; i <= N; i++){
                // contains 대신 배열 만들어 visited[] 로 처리해도 무방하다.
                //
                if(!STACK.contains(i)){
                    STACK.push(i);
                    DFS();
                    STACK.pop();
                }
            }
        }
    }
}
