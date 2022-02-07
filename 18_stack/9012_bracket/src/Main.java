import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            List<Character> c_stack = new LinkedList<>();
            c_stack.add(str.charAt(0));
            int stack_ptr = 0;
            for(int j = 1; j < str.length(); j++){
                if(stack_ptr != -1 && c_stack.get(stack_ptr) == '(' && str.charAt(j) == ')'){
                    c_stack.remove(stack_ptr);
                    stack_ptr--;
                }
                else{
                    c_stack.add(str.charAt(j));
                    stack_ptr++;
                }
            }
            if(stack_ptr == -1) bw.write("YES");
            else bw.write("NO");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
