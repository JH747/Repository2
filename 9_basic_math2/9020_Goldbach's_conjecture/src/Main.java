import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int givenNun = Integer.parseInt(br.readLine());
            // 중간값에서 시작해서 내려가면서 소수를 찾는다. 소수를 찾고 원수에서 소수를 뺀것도 소수이면 그건 소수이다?
            // 혹은 그 아래의 소수를 전부 찾고 중간값에서 시작하여 내려가며 원수에서 소수를 뺀것이 소수에 속하는 지 확인한다.
            List<Integer> primeNum_below_half = new ArrayList<>();
            List<Integer> primeNum_over_half = new ArrayList<>();
            for(int j = 2; j <= givenNun; j++){
                boolean prime = true;
                int mid_val = (int)Math.sqrt(j);
                for(int m = 2; m <= mid_val; m++){
                    if(j % m == 0){
                        prime = false;
                        break;
                    }
                }
                if(prime){
                    if(j <= givenNun/2) primeNum_below_half.add(j);
                    else primeNum_over_half.add(j);
                }

            }
            StringBuilder sb = new StringBuilder();
            int last_of_half = primeNum_below_half.get(primeNum_below_half.size()-1);
            if(last_of_half*2 == givenNun) sb.append(last_of_half).append(" ").append(last_of_half).append("\n");
            else{
                for(int j = primeNum_below_half.size()-1; j >= 0; j--){
                    if(primeNum_over_half.contains(givenNun - primeNum_below_half.get(j))){
                        sb.append(primeNum_below_half.get(j)).append(" ").append(givenNun - primeNum_below_half.get(j)).append("\n");
                        break;
                    }
                }
            }
            bw.write(sb.toString());

        }
        bw.flush();
        bw.close();
    }
}
