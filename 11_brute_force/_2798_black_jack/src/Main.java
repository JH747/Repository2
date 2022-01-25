import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) list.add(Integer.parseInt(stk.nextToken()));

        int gap = M;
        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int l = j+1; l < N; l++){
                    int sum = list.get(i) + list.get(j) + list.get(l);
                    if(sum <= M){
                        if(M - sum < gap){
                            gap = M - sum;

                        }
                    }
                }
            }
        }
        bw.write(Integer.toString(M-gap));
        bw.flush();
        bw.close();
    }
}
