import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        Deque<Integer> i_deque = new ArrayDeque<>();
        for(int i = 1; i <= N; i++){
            i_deque.offerLast(i);
        }

        List<Integer> targets = new LinkedList<>();
        stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int tmp = Integer.parseInt(stk.nextToken());
            targets.add(tmp);
        }

        int cnt = 0;
        for(int i = 0; i < M; i++){
            int tgt = targets.get(i);
            int left = 0;
            int right = 0;
            Deque<Integer> left_deque = new ArrayDeque<>(i_deque);
            while(true){
                int a = left_deque.getFirst();
                if(tgt == a){
                    left_deque.pollFirst();
                    break;
                }
                else{
                    left_deque.offerLast(left_deque.pollFirst());
                    left++;
                }
            }
            Deque<Integer> right_deque = new ArrayDeque<>(i_deque);
            while(true){
                int a = right_deque.getFirst();
                if(tgt == a){
                    right_deque.pollFirst();
                    break;
                }
                else{
                    right_deque.offerFirst(right_deque.pollLast());
                    right++;
                }
            }
            if(left < right){
                cnt += left;
                i_deque = left_deque;
            }
            else{
                cnt += right;
                i_deque = right_deque;
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();

        // 2 4 5 3 1 9 9 9 9 경우 1이 가운데에 있지만 왼쪽으로는 4번 오른쪽으로는 5번 가야한다.

    }
}
