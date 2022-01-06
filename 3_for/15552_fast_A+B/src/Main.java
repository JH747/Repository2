import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        List<Integer> list_a = new ArrayList<>();
        List<Integer> list_b = new ArrayList<>();
        StringTokenizer stk;
        try{
            n = Integer.parseInt(br.readLine());
            for(int i = 0; i < n; i++){
                stk = new StringTokenizer(br.readLine());
                list_a.add(Integer.parseInt(stk.nextToken()));
                list_b.add(Integer.parseInt(stk.nextToken()));
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            for(int i = 0; i < n; i++){
                bw.write(list_a.get(i) + list_b.get(i) + "\n");
            }
            bw.flush();
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}