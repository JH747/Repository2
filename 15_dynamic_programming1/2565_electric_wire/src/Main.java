import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        // dp : length of longest increasing partial sequence ends with i_th element
        // w[i] : cost of i_th element
        // LIS(Longest Increasing Sequence problem

        int[] dp = new int[501];

        List<wire> wires = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            wires.add(new wire(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())));
        }

        wires.sort(Comparator.naturalOrder());

        dp[wires.get(0).depart] = 1;

        if(n == 1){
            bw.write("0");
        }

        else{
            int max = 0;
            for(int i = 1; i < n; i++){
                int tmp = 0;
                for(int j = i-1; j >= 0; j--){
                    if(wires.get(i).dest > wires.get(j).dest && dp[wires.get(j).depart] > tmp) tmp = dp[wires.get(j).depart];
                }
                dp[wires.get(i).depart] = tmp + 1;
                if(tmp + 1 > max) max = tmp + 1;
            }
            bw.write(Integer.toString(n - max));
        }
        bw.flush();
        bw.close();
    }
}

class wire implements Comparable<wire>{
    int depart;
    int dest;

    public wire(int depart, int dest) {
        this.depart = depart;
        this.dest = dest;
    }

    @Override
    public int compareTo(wire o){
        return depart - o.depart;
    }
}