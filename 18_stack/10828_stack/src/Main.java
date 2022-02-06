import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        stack t_stack = new stack();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            String command = stk.nextToken();
            switch (command){
                case "push":
                    t_stack.push(Integer.parseInt(stk.nextToken()));
                    break;
                case "pop":
                    bw.write(Integer.toString(t_stack.pop()) + "\n");
                    break;
                case "size":
                    bw.write(Integer.toString(t_stack.size()) + "\n");
                    break;
                case "empty":
                    bw.write(Integer.toString(t_stack.empty()) + "\n");
                    break;
                case "top":
                    bw.write(Integer.toString(t_stack.top()) + "\n");
                    break;
            }

        }
        bw.flush();
        bw.close();
    }
}

class stack{
    List<Integer> i_stack = new LinkedList<>();
    int stack_pointer = -1;

    public void push(int i){
        i_stack.add(i);
        stack_pointer++;
    }
    public int pop(){
        if(stack_pointer == -1) return -1;
        else{
            int tmp = i_stack.get(stack_pointer);
            i_stack.remove(stack_pointer);
            stack_pointer--;
            return tmp;
        }
    }
    public int size(){
        return stack_pointer+1;
    }
    public int empty(){
        if(stack_pointer == -1) return 1;
        else return 0;
    }
    public int top(){
        if(stack_pointer == -1) return -1;
        else return i_stack.get(stack_pointer);
    }
}