import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        bw.write(Integer.toString(func(n, arr)));
        bw.flush();
        bw.close();
    }

    public static int func(int i, int[] arr){
        if(arr[i] != 0) return arr[i];
        else{
            if(i == 1){
                arr[i] = 1;
                return 1;
            }
            else if(i == 2){
                arr[i] = 2;
                return 2;
            }
            else{
                int tmp = (func(i-1, arr) + func(i-2, arr)) % 15746;
                arr[i] = tmp;
                return tmp;
            }
        }
    }
}
