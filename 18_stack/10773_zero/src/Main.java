import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] i_stack = new int[n+1];

        int stack_pointer = -1;
        for(int i = 0; i < n; i++){
            int command = Integer.parseInt(br.readLine());
            if(command == 0){
                i_stack[stack_pointer] = 0;
                stack_pointer--;
            }
            else{
                stack_pointer++;
                i_stack[stack_pointer] = command;
            }
        }
        int result = 0;
        for(int i = 0; i <= stack_pointer; i++){
            result += i_stack[i];
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}
