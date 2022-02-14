import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String str = br.readLine();
            if(str.equals(".")) break;
            else{
                Stack<Character> c_stack = new Stack<>();
                char tmp = str.charAt(0);
                if(tmp == '(' || tmp == '[' || tmp == ')' || tmp == ']')
                c_stack.push(tmp);

                for(int i = 1; i < str.length(); i++){
                    tmp = str.charAt(i);
                    if(tmp == '(' || tmp == '[' || tmp == ')' || tmp == ']'){
                        if(c_stack.isEmpty()) c_stack.push(tmp);
                        else{
                            if((c_stack.peek() == '(' && tmp == ')') || (c_stack.peek() == '[' && tmp == ']')){
                                c_stack.pop();
                            }
                            else c_stack.push(tmp);
                        }
                    }
                }
                if(c_stack.isEmpty()) bw.write("yes");
                else bw.write("no");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        // has to deal with first letter differently !
    }
}
