import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> symbols = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        String origin_str = br.readLine();
        StringTokenizer stk = new StringTokenizer(origin_str, "+-");
        while(stk.hasMoreTokens()){
            numbers.add(Integer.parseInt(stk.nextToken()));
        }
        for(int i = 0; i < origin_str.length(); i++){
            if(origin_str.charAt(i) == '+') symbols.add("+");
            else if(origin_str.charAt(i) == '-') symbols.add("-");
        }
        // symbols and integers saved in lists as in its order in string

        int result = 0;
        int relative_mark = 1;
        result += numbers.get(0);

        for(int i = 1; i < numbers.size(); i++){
            if(symbols.get(i-1).equals("-")){
                relative_mark = -1;
            }
            if(relative_mark == -1) result -= numbers.get(i);
            else result += numbers.get(i);
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}
