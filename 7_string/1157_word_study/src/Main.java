import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        br.close();
        str = str.toUpperCase(); //A 65 Z 90
        int[] arr = new int[91];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++;
        }

        List<Integer> tmp_l = new ArrayList<>();
        int max = 0;
        for(int i = 65; i <= 90; i++){
            if(max < arr[i]){
                max = arr[i];
                tmp_l.clear();
                tmp_l.add(i);
            }
            else if(max == arr[i]){
                tmp_l.add(i);
            }
            else continue;
        }
        if(tmp_l.size() > 1) bw.write("?");
        else bw.write(tmp_l.get(0));
        bw.flush();
        bw.close();
    }
}
