import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        long[] dp_arr = new long[101];
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            bw.write(Long.toString(Pad(N, dp_arr)));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static long Pad(int i, long[] arr){
        if(arr[i] != 0) return arr[i];
        else{
            if(i <= 3){
                arr[i] = 1;
                return 1;
            }
            else if(i <= 5){
                arr[i] = 2;
                return 2;
            }
            else{
                long tmp = Pad(i-1, arr) + Pad(i-5, arr);
                arr[i] = tmp;
                return tmp;
            }
        }
    }
}
