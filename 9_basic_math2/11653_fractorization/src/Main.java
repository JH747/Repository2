import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = n;
        List<Integer> prime_n_list = new ArrayList<>();
        List<Integer> prime_n_cnt = new ArrayList<>();
        while(true){
            Pair p = fractorize(m);
            if(p == null) break;
            m = p.f;
            prime_n_list.add(p.s);
            prime_n_cnt.add(p.t);
        }
        if(prime_n_cnt.isEmpty()) System.out.println(n);
        else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < prime_n_cnt.size(); i++){
                String str = Integer.toString(prime_n_list.get(i)) + "\n";
                sb.append(str.repeat(prime_n_cnt.get(i)));
            }
            System.out.println(sb.toString());
        }
    }

    public static Pair fractorize(int given_n){
        int half_val_original = given_n/2;
        int cnt = 0;
        int prime_n = 0;
        for(int i = 2; i <= half_val_original; i++){
            int mid_val_prime = (int)Math.sqrt(i);
            boolean prime = true;
            for(int j = 2; j <= mid_val_prime; j++){
                if(i % j == 0){
                    prime = false;
                }
            }
            if(prime){
                while(given_n % i == 0){
                    cnt++;
                    given_n /= i;
                }
                break; // break if calculation done for one prime number
            }
            //if(cnt != 0) result_pairs.add(new Pair(i, cnt));
        }
        if(cnt == 0) return null;
        else return new Pair(given_n, prime_n, cnt);
    }

}


class Pair{
    int f;
    int s;
    int t;

    public Pair(int f, int s, int t) {
        this.f = f;
        this.s = s;
        this.t = t;
    }
}
