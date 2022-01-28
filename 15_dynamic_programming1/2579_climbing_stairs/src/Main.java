import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] W = new int[n+1];
        for(int i = 1; i <= n; i++){
            W[i] = Integer.parseInt(br.readLine());
        }
        // data input done above
        int[] continuous = new int[n+1];
        int[] discontinuous = new int[n+1];
        pair result_pair = func(n, continuous, discontinuous, W);
        bw.write(Integer.toString(Math.max(result_pair.f, result_pair.s)));
        bw.flush();
        bw.close();
    }

    public static pair func(int i, int[] con, int[] disCon, int[] w){
        if(con[i] != 0 && disCon[i] != 0) return new pair(con[i], disCon[i]);
        else{
            if(i == 1){
                con[i] = w[i];
                disCon[i] = w[i];
                return new pair(w[i], w[i]);
            }
            else if(i == 2){
                con[i] = w[i-1] + w[i];
                disCon[i] = w[i];
                return new pair(con[i], disCon[i]);
            }
            else{
                // con : max of total cost when step on i.th stair while stepping i-1.th stair
                // disCon : max of total cost when step on i.th stair while stepping i-2.th stair (not stepping i.th stair)
                int tmp_con = func(i-1, con, disCon, w).s + w[i];
                int tmp_disCon = Math.max(func(i-2, con, disCon, w).f, func(i-2, con, disCon, w).s) + w[i];
                con[i] = tmp_con;
                disCon[i] = tmp_disCon;
                return new pair(tmp_con, tmp_disCon);
            }
        }
    }
}
// f : con // c : disCon
class pair{
    int f;
    int s;

    public pair(int f, int s) {
        this.f = f;
        this.s = s;
    }
}