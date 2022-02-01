import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        // W[i] : cost of i_th cup
        // con[i] : max cost if i-1, i_th cup chosen
        // discon[i] : max cost if i-1 not chosen, i_th cup chosen
        int[] W = new int[n+1];
        int[] con = new int[n+1];
        int[] discon = new int[n+1];

        for(int i = 1; i <= n; i++) W[i] = Integer.parseInt(br.readLine());

        if(n <= 2){
            if(n == 1) bw.write(Integer.toString(W[1]));
            else bw.write(Integer.toString(W[1] + W[2]));
        }
        else{
            con[1] = W[1];
            discon[1] = W[1];
            con[2] = W[1] + W[2];
            discon[2] = W[2];

            for(int i = 3; i <= n; i++){
                con[i] = discon[i-1] + W[i];
                discon[i] = Math.max(Math.max(con[i-2], discon[i-2]), con[i-3]) + W[i];
            }

            int result = Math.max(Math.max(con[n], discon[n]), con[n-1]);
            bw.write(Integer.toString(result));
        }
        bw.flush();
        bw.close();

        // check below !
        //6
        //1000
        //900
        //2
        //1
        //800
        //700
        //ans 3400
    }
}
