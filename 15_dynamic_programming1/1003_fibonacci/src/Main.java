import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++){
            int given_n = Integer.parseInt(br.readLine());
            z1[] zero_one_cnt = new z1[given_n + 1];
            for(int j = 0; j < given_n + 1; j++){
                zero_one_cnt[j] = new z1(0,0);
            }

            //System.out.println(zero_one_cnt[given_n].one);

            z1 tmp = fib(given_n, zero_one_cnt);

            StringBuilder sb = new StringBuilder();
            sb.append(tmp.zero).append(" ").append(tmp.one).append("\n");
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }

    public static z1 fib(int n, z1[] cnt){

        if(!(cnt[n].zero == 0 && cnt[n].one == 0)){
            //System.out.println("--");
            return cnt[n];
        }
        else{
            if(n == 0){
                cnt[n].zero = 1;
            }
            else if(n == 1){
                cnt[n].one = 1;
            }
            else{
                //System.out.println("-");
                cnt[n].zero += (fib(n-1, cnt).zero + fib(n-2, cnt).zero);
                cnt[n].one += (fib(n-1, cnt).one + fib(n-2, cnt).one);
            }
        }
        return cnt[n];
    }
}

class z1{
    int zero = 0;
    int one = 0;

    public z1(int zero, int one) {
        this.zero = zero;
        this.one = one;
    }
}