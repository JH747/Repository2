import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> numList = new ArrayList<>();
        while(true){
            String str = br.readLine();
            if(str.equals("0")) break;
            numList.add(Integer.parseInt(str));
        }
        StringBuilder sb = new StringBuilder();
        for(int n : numList){
            int cnt = 0;
            for(int i = n+1; i <= 2*n; i++){
                boolean prime = true;
                if(i == 1) prime = false;
                int mid_val = (int)Math.sqrt(i);
                for(int j = 2; j <= mid_val; j++){
                    if(i % j == 0){
                        prime = false;
                        break;
                    }
                }
                if(prime) cnt++;
            }
            sb.append(cnt).append("\n");

        }
        bf.write(sb.toString());
        bf.flush();
        bf.close();
    }
}
